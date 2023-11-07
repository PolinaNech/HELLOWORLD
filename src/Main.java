public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее заданее №5. Тема: Условный оператор.");
        System.out.println("Задача №1");
        int typeSystem = 1;
        switch (typeSystem) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для данного вида операционной системы приложение пока не предусмотренно.");
        }
        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
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
        System.out.println("Задача №3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day );
        } else if (deliveryDistance >= 20 && deliveryDistance <60){
            System.out.println("Потребуется дней: " + (day+1));
        } else if (deliveryDistance >= 60 && deliveryDistance <100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else {
            System.out.println("Нет доставки в этот район.");
        }
        System.out.println("Задача №5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон: Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}