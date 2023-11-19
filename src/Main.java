import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №8. Тема: Массивы");
        System.out.println("Задача №1.");
        int [] first = new int [3];
        first[0] = 1;
        first[1] = 2;
        first [2] = 3;
        double [] second = new double[3];
        second[0] = 1.57;
        second[1] =7.654;
        second[2] = 9.986;
        int [] third = {10,11,12,13,14,15,16,17};
        System.out.println("Задача №2.");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));
        System.out.println("Задача №3.");
        int indexFirst = 3;
        while (indexFirst >1) {
            indexFirst = indexFirst - 1;
            System.out.print(first[indexFirst] + ", ");}
        System.out.println(first[0]);
        int indexSecond = 3;
        while (indexSecond >1) {
            indexSecond = indexSecond - 1;
            System.out.print(second[indexSecond] + ", ");}
        System.out.println(second[0]);
        int indexThird = 8;
        while (indexThird >1) {
            indexThird = indexThird - 1;
            System.out.print(third[indexThird] + ", ");}
        System.out.println(third[0]);
        System.out.println("Задача №4.");
        for (int x = 0; x < first.length; x++)
            if (first[x] % 2 == 0) {
                System.out.print(first[x] + " ");
            } else {
                first[x]= first[x] + 1;
                System.out.print(first[x] + " ");
            }
    }
}