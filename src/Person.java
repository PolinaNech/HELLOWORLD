public class Person {
    public static String name;
    public static String surname;
    public Person(String name,  String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String toString(){
        return "Автор: " + name + " "  + surname;
    }

}
