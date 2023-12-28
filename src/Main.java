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

        Gryffindor [] potterSquad = {
                new Gryffindor("Поттер ","Гарри", 62,27,67,43,98),
                new Gryffindor("Грейнджер ","Гермиона",95,78,70,80,50),
                new Gryffindor("Уизли ","Рон",34,48,40,56,39),
        };
        Slytherin [] malfoySquad = {
                new Slytherin("Малфой ","Драко",69,57,74,65,46,69,87),
                new Slytherin("Монтегю ","Грэхэм",45,17,53,36,71,78,57),
                new Slytherin("Гойл ","Грегори",29,20,5,87,46,56,90),
        };
        Hufflepuff [] diggorySquad = {
                new Hufflepuff("Смит ","Захария",59,46,87,67,74),
                new Hufflepuff("Диггори ", "Седрик",56,73,69,86,75),
                new Hufflepuff("Финч-Флетчли ","Джастин",42,48,76,70,97),
        };
        Ravenclaw [] lovegoodSquad = {
                new Ravenclaw("Чанг ","Чжоу",86,75,64,42,73,57),
                new Ravenclaw("Патил ","Падма",70,62,78,43,54,39),
                new Ravenclaw("Белби ","Маркус", 68,71,51,87,12,61),
        };

        System.out.println(Arrays.toString(new Gryffindor[]{potterSquad[0]}));
        System.out.println(Arrays.toString(new Slytherin []{malfoySquad[2]}));
        System.out.println(Arrays.toString(new Hufflepuff []{diggorySquad[1]}));
        System.out.println(Arrays.toString(new Ravenclaw [] {lovegoodSquad[0]}));
        Hogwarts.bestWizard(students[0],students [1]);
        Gryffindor.bestOnGryffindor(potterSquad[2],potterSquad [1]);
        Slytherin.bestOnSlytherin(malfoySquad[0],malfoySquad[1]);
        Hufflepuff.bestOnHufflepuff(diggorySquad[1],diggorySquad[0]);
        Ravenclaw.bestOnRavenclaw(lovegoodSquad[2],lovegoodSquad[0]);
    }
}