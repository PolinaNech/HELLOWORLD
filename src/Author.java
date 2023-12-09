import java.util.Objects;
public class Author{
    private String name;
    private String surname;
    public Author(String name,  String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return Objects.equals(name, author1.name) && Objects.equals(surname, author1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String toString(){
        return "Автор: " + name + " "  + surname;
    }

}
    public String toString(){
        return author + "Количество страниц: " + pageAmount + " Год публикации: " + published + " Книга:" + title;
    }

}
}
