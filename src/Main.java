public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 12. Тема: Объекты и классы.");
        Author author1 = new Author("Stephen"," King ");
        Book book1= new Book( "Stephen King ",1248, " Book Published in 1986", " It");
        System.out.println("book1 = " + author1.author + book1.pageAmount + book1.published + book1.title );
        Author author2 = new Author("Leo"," Tolstoy ");
        Book book2= new Book("Leo Tolstoy ", 1300, " Book Published in 1865-1869", " War and peace");
        System.out.println("book2 = " + author2.author + book2.pageAmount + book2.published + book2.title);
    }
}