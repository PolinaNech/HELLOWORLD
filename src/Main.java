public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее аданее №7. Тема: Циклы. Часть 2.");
        System.out.println("Задача №1");
        int i = 0;
        int salary = 15_000;
        int percent = salary/100;
        int total = 0;
        while (total<2_459_000) {
            System.out.println("Месяц " +i+ ", сумма накоплений равна: " + total + " рублей");
            i = i+1;
            total = total+salary+percent;
        }
        System.out.println("Задача №2");
        int a= 1;
        while (a < 11){
            System.out.print(a + " ");
            a= a+1;
        }
        System.out.println();
        for (int b =10; b > 0; b= b-1){
            System.out.print(b + " ");
        } System.out.println();
        System.out.println("Задача №3");
        int population = 12_000_000;
        int birth = population*17/1000;
        int death =population*8/1000;
        int y = 2020;
        while (y < 2031) {
            System.out.println("Год  " +y+ ", численность населения составляет " + population + " человек");
            y = y+1;
            population=population+birth-death;
        }
        System.out.println("Задача №4");
        int v = 0;
        int input = 15_000;
        int percentVasi = input*7/100;
        int totaly = 0;
        while (totaly<12_000_000) {
            System.out.println("Месяц " +v+ ", сумма накоплений равна: " + totaly + " рублей");
            v = v+1;
            totaly = totaly+input+percentVasi;
        }
        System.out.println("Задача №5");
        int s = 0;
        int inputs = 15_000;
        int percentVasiliya = input*7/100;
        int totalyVas = 0;
        while (totalyVas<12_000_000){
            if (s%6== 0){
                System.out.println("Месяц " +s+ ", сумма накоплений равна: " + totalyVas + " рублей");
            }
            s = s+1;
            totalyVas = totalyVas+inputs+percentVasiliya;
        }
        System.out.println("Задача №6");

        System.out.println("Задача №7");

    }
}