import java.util.Objects;

public class Employee {
    private static int id = 0;
    private String surname;
    private String name;
    private String paternity;
    private int section;
    private int salary;
    public static int sum;
    public static int min;
    public static int max;
    public static int middle;

    public Employee(String surname, String name, String paternity, int section, int salary) {
        id = id + 1;
        this.surname = surname;
        this.name = name;
        this.paternity = paternity;
        this.section = section;
        this.salary = salary;

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
        sum = sum + salary;
        if (id < 2) {
            min = salary;}
        if (min > salary) {
            min = salary;
        }
        if (id < 2) {
            max = salary;}
        if (max < salary) {
            max = salary;
        }
        middle = sum/id;
        return "ID: " + id + ". Ф.И.О: " + surname + " " + name + " " + paternity + ". Отдел: " + section + ". Заработная плата: " + salary + " рублей. Сумма заработной платы всех рабочих: " + sum + " рублей. Минимальная заработная плата: " + min +" рублей. Максимальная заработная плата: " + max + " рублей. Среднее значение зарплат: "+ middle;
    }

}
