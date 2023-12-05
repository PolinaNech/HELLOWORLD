public class Author {
    String author;
    String name;
    String surname;
    public Author(String name,  String surname) {
        this.name = name;
        this.surname = surname;
        this.author = name + surname;
    }
    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}