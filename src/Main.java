public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №6. Тема: Циклы");
        System.out.println("Задача №1");
        for (int i = 1; i < 11; i=i+1){
            System.out.println(i);
        }
        System.out.println("Задача №2");
        for (int i = 10; i > 0; i=i-1){
            System.out.println(i);
        }
        System.out.println("Задача №3");
        for (int i = 0; i < 17; i=i+2){
            System.out.println(i);
        }
        System.out.println("Задача №4");
        for (int i = 10; i >-11; i=i-1){
            System.out.println(i);
        }
        System.out.println("Задача №5");
        for (int i = 1904; i < 2097; i=i+4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача №6");
        for (int i = 7; i < 99; i=i+7){
            System.out.println(i);
        }
        System.out.println("Задача №7");
        for (int i = 1; i < 513; i=i*2){
            System.out.println(i);
        }
        System.out.println("Задача №8");
        for (int i = 1, jar = 29000, salary = 29000; i < 13; i=i+1, jar = jar+salary){
            System.out.println("Месяц " +i+ ", сумма накоплений равна: " + jar + " рублей");
        }
        System.out.println("Задача №9");
        for (int i = 1, salary = 29000, jar = 29000+ salary / 100 ; i < 13; i=i+1, jar = jar+salary) {
            System.out.println("Месяц " +i+ ", сумма накоплений равна: " + jar + " рублей");
        }
        System.out.println("Задача №10");
        for (int i = 1; i < 11; i=i+1){
            System.out.println("2*" +i+ "=" + 2*i);
        }
    }
}