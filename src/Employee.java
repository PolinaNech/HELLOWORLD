import java.util.Objects;

public class Employee {
    private int id;
    private String surname;
    private String name;
    private String paternity;
    private int section;
    private int salary;
    private static int counter = 1;
    public Employee(String surname, String name, String paternity, int section, int salary) {
        this.surname = surname;
        this.name = name;
        this.paternity = paternity;
        this.section = section;
        this.salary = salary;
        this.id = counter++;
    }
    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPaternity() {
        return paternity;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int getSection) {
        this.section = section;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int getSalary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ". Ф.И.О: " + surname + " " + name + " " + paternity + ". Отдел: " + section + ". Заработная плата: " + salary + " рублей.";
    }


}
