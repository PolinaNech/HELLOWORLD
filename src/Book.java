import java.util.Objects;

public class Book {
    private Author author;
    private int pageAmount;
    private int published;
    private String title;

        public Book( Author author, int pageAmount, int published, String title) {
            this.author = author;
            this.pageAmount = pageAmount;
            this.published = published;
            this.title = title;
        }
        public Author getAuthor() {
        return this.author;
    }
        public int getPageAmount() {
            return this.pageAmount;
        }
        public int getPublished() {
            return published;
        }

        public void setPublished(int published) {
            this.published = published;

        }
        public String getTitle() {
            return title;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageAmount == book.pageAmount && published == book.published && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, pageAmount, published, title);
    }

    public String toString(){
        return author + "Количество страниц: " + pageAmount + " Год публикации: " + published + " Книга:" + title;
    }

}