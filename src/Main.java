import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Shortman", "Arnold", "Ivanovich", 2, 90000);
        employees[1] = new Employee("Haruno", "Sakura", "Ivanovna", 4, 75000);
        employees[2] = new Employee("Sawyer", "Lila", "Konstantinovna", 1, 65000);
        employees[3] = new Employee("Uzumaki", "Naruto", "Ivanovich", 3, 70000);
        employees[4] = new Employee("Watterson", "Gumball", "Ivanovich", 4, 85000);
        employees[5] = new Employee("Pines", "Stanley", "Borisovich", 5, 120000);
        employees[6] = new Employee("Pataki", "Olga", "Borisovna", 1, 115000);
        employees[7] = new Employee("Pataki", "Helga", "Borisovna", 5, 85000);
        employees[8] = new Employee("Uchiha", "Sasuke", "Vicktorovich", 2, 95000);
        employees[9] = new Employee("Simpson", "Marge", "Alexandrovna", 3, 185000);
        Employee employee = employees[0];
        String name = employee.getName();
        System.out.println(name);
        System.out.println(employee);
        int salarySum = getSumSalary();
        System.out.println("Сумма затрат на зарплаты в месяц: " + salarySum);
        int salaryMin = getSalaryMin();
        System.out.println("Сотрудник  с минимальной зарплатой: " + salaryMin);
        int salaryMax = getSalaryMax();
        System.out.println("Сотрудник  с максимальной зарплатой: " + salaryMax);
        int salaryAverage = getSalaryAverage();
        System.out.println("Среднее значение зарплат: " + salaryAverage);
    }

    private static int getSumSalary() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            int salary = employee.getSalary();
            result = result + salary;
        }
        return result;
    }
    private static int getSalaryMin() {
        Employee employeeOne = employees[0];
        int salaryOne = employeeOne.getSalary();
        int result = salaryOne;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            int salary = employee.getSalary();
            if (result > salary) {
                result = salary;
            }
        }
        return result;
    }
    private static int getSalaryMax() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            int salary = employee.getSalary();
            if (result < salary) {
                result = salary;
            }
        }
        return result;
    }
    private static int getSalaryAverage() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            int salary = employee.getSalary();
            result = result + salary;
        }
        result = result /(employees.length-1);
        return result;
    }
}
