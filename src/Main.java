public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 12. Тема: Объекты и классы.");
        Author author1 = new Author("Stephen"," King ");
        Book book1= new Book( "Stephen King ",1248, 1986, " It");
        System.out.println(author1 + " " + book1 );
        Author author2 = new Author("Leo"," Tolstoy ");
        Book book2= new Book("Leo Tolstoy ", 1300, 1869, " War and peace");
        System.out.println(author2 + " " + book2 );

    }
}