public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println("Задание 2");
        int temp = 14;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задание 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задание 4");
        int year = 25;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад.");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу.");
        }
        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в университет.");
        }
        if (year > 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить на работу.");
        }
        System.out.println("Задание 5");
        int babyAge = 24;
        if (babyAge < 5) {
            System.out.println("Если возраст ребенка равен " + babyAge + " то ему нельзя кататься на аттракционе");
        }
        else if (babyAge < 14) {
            System.out.println("Если возраст ребенка равен " + babyAge + " то можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + babyAge + " то можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int seat= 104;
        boolean haveSeat = seat <= 102;
        if (seat <= 60) {
            System.out.println("В вагоне есть сидячее и стоячее место.");
        }
        else if (haveSeat) {
            System.out.println("В вагоне есть стоячее место.");
        }
        else {
            System.out.println("Мест нет. Вагон уже полностью забит.");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 6;
        int three = 7;
        if (one < two) {
            System.out.println(one + " меньше " + two);
        } else {
            System.out.println(two + " меньше "+ one);
        }
        if (two < three) {
            System.out.println(two + " меньше " + three);
        } else {
            System.out.println(three + " меньше " + two);
        }
        if (three < one) {
            System.out.println(three + " меньше " + one);
        } else {
            System.out.println( one + " меньше " + three);
        }



    }
}


