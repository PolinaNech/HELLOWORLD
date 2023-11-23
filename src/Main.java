public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №9. Тема: Массивы. Часть 2.");
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(arr);
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i = i + 1;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = 0;
        int i = 0;
        do {
            if (min > arr[i]) {
                min = arr[i];
            }
            i = i + 1;
        } while (i < arr.length);
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");

        i = i * 0;
        do {
            if (max < arr[i]) {
                max = arr[i];
            }
            i = i + 1;
        } while (i < arr.length);
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        int average = 0;
        int i = 0;
        while (i < arr.length) {
            average= average + arr[i];
            i = i + 1;
        }
        average = average / i;
        System.out.println("Средняя сумма трат за месяц (" + i + " дней) составила " + average + " рублей.");
    }
    public static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i =  reverseFullName.length - 1;
        while (i > -1) {
            System.out.print(reverseFullName[i]);
            i = i - 1;
        }
    }
}

