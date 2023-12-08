public class Author {
    String author;
    String name;
    String surname;
    public Author(String name,  String surname) {
        this.name = name;
        this.surname = surname;
        this.author = name + surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
