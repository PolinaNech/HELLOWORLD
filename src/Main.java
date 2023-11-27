public class Main {
    public static void countingLeapYear(int year){
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 11. Тема: Методы");
        System.out.println("Задача №1");
        int year = 2021;
        countingLeapYear(year);
        System.out.println("Задача №2");
        System.out.println("Задача №3");
    }
}