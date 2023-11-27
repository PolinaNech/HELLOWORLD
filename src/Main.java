public class Main {
    public static void countingLeapYear(int year){
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void calculationVersionDevice(int clientDeviceYear, int typeSystem){
        boolean oldVersion = clientDeviceYear < 2015;
        boolean iosType = typeSystem == 0;
        boolean androidType = typeSystem == 1;
        if (oldVersion && iosType){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (iosType){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }  else if (oldVersion && androidType){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (androidType){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Для данного вида операционной системы приложение пока не предусмотренно.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 11. Тема: Методы");
        System.out.println("Задача №1");
        int year = 2021;
        countingLeapYear(year);
        System.out.println("Задача №2");
        int clientDeviceYear = 2010;
        int typeSystem = 1;
        calculationVersionDevice(clientDeviceYear,typeSystem);
        System.out.println("Задача №3");
    }
}