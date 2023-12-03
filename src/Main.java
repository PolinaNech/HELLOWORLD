public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 12. Тема: Объекты и классы.");
        Author author1 = new Author("S. King ");
        Book book1= new Book( "S. King ",1248, " Book Publishing Ltd. 1986");
        System.out.println("book1 = " + author1.author + book1.pageAmount + book1.publisher );
        Author author2 = new Author("L. Tolstoy ");
        Book book2= new Book("L. Tolstoy ", 1300, " Book Publishing Ltd. 1865-1869");
        System.out.println("book2 = " + author2.author + book2.pageAmount + book2.publisher );
    }
}