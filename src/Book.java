public class Book {
    String author;
    int pageAmount;
    String publisher;

    public Book( String author, int pageAmount, String publisher) {
        this.pageAmount = pageAmount;
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
