public class Book {
    Author author ;
    int pageAmount;
    String published;
    String title;

    public Book( String author , int pageAmount, String published, String title) {
        this.pageAmount = pageAmount;
        this.published = published;
        this.title = title;
    }
    public int getPageAmount() {
        return this.pageAmount;
    }
    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;

    }
    public String getTitle() {
        return title;
    }
}
