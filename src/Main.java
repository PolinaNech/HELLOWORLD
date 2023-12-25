import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hogwarts [] students = {
                new Hogwarts("Поттер ","Гарри", 72,27),
                new Hogwarts("Грейнджер ","Гермиона",95,78),
                new Hogwarts("Уизли ","Рон",34,48),
                new Hogwarts("Малфой ","Драко",69,57),
                new Hogwarts("Монтегю ","Грэхэм",45,17),
                new Hogwarts("Гойл ","Грегори",29,20),
                new Hogwarts("Смит ","Захария",59,46),
                new Hogwarts("Диггори ", "Седрик",56,73),
                new Hogwarts("Финч-Флетчли ","Джастин",42,48),
                new Hogwarts("Чанг ","Чжоу",86,75),
                new Hogwarts("Патил ","Падма",70,62),
                new Hogwarts("Белби ","Маркус", 68,71),
        };
        System.out.println("Всего студентов: " + students.length);
        for (int i = 0; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            System.out.println(students[i]);
        }
    Gryffindor [] potterSquad = {
                new Gryffindor("Поттер","Гарри", 62,27,67,43,98),

    };
        for (int i = 0; i <potterSquad.length; i++) {
            Gryffindor gryffindor = potterSquad[i];
            System.out.println(potterSquad[i]);
        }
    }
}