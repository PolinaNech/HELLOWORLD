public class Book {
    Author author ;
    int pageAmount;
    String publisher;

    public Book( String author , int pageAmount, String publisher) {
        this.pageAmount = pageAmount;
        this.publisher = publisher;
    }
    public int getPageAmount() {
        return this.pageAmount;
    }
    public void setPageAmount() {
        this.pageAmount = pageAmount;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

