import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир.");
        System.out.println("Hello World!");
      System.out.println("Домашнее заданее №1.Тема: Переменные. Часть  1.");
        System.out.println("Задача №1 ");
        var dogs = 8.0;
        var cats = 3.6;
        var paper = 763789;
        System.out.println(dogs);
        System.out.println(cats);
        System.out.println(paper);
        System.out.println("Задача №2");
        dogs = dogs + 4;
        cats = cats + 4;
        paper = paper + 4;
        System.out.println(dogs);
        System.out.println(cats);
        System.out.println(paper);
        System.out.println("Задача №3");
        dogs = dogs - 3.5;
        cats = cats - 1.6;
        paper = paper - 7639;
        System.out.println(dogs);
        System.out.println(cats);
        System.out.println(paper);
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача №6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerBoth = boxerOne + boxerTwo;
        System.out.println("Вес обоих бойцов " + boxerBoth + " кг");
        var boxerMargin = boxerOne - boxerTwo;
        System.out.println(boxerMargin);
        System.out.println("Задача №7");
        var boxerDifference = boxerTwo - boxerOne;
        System.out.println("Вес второго бойца больше веса первого на " + boxerDifference + " кг");
        var boxerDifferential = boxerTwo % boxerOne;
        System.out.println("Первый боец уступает своему оппоненту  на " + boxerDifferential + " кг");
        System.out.println("Задача №8");
        var timeWork = 640;
        var timeShift = 8;
        var allWorkers = timeWork / timeShift;
        System.out.println(" 1. Всего работников в компании — " + allWorkers + " человек");
        allWorkers = allWorkers + 94;
        timeWork = allWorkers * timeShift;
        System.out.println("Если в компании работает " + allWorkers + " человек, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");
     System.out.println("Домашнее заданее №2.Тема: Переменные. Часть 2.");
      System.out.println("Задание №1");
        byte a = 127;
        short b = 200;
        int c = 40000;
        long d = 3000000L;
        float e = 3.14F;
        double f = 1.12345678;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Задание №2");
        float g = 27.12F;
        long h = 987678965549L;
        float i = 2.786F;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;
        System.out.println("Задание №3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short allPaper = 480;
        int studentPaper = allPaper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");
        System.out.println("Задание №4");
        byte bottleMinute = 16 / 2;
        int bottleTwenty = bottleMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleTwenty + " штук бутылок");
        int bottleDay = bottleTwenty * 3 * 24;
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        int bottleThree = bottleDay * 3;
        System.out.println("За 3 дня машина произвела " + bottleThree + " штук бутылок");
        int bottleMonth = bottleThree * 10;
        System.out.println("За месяц машина произвела " + bottleMonth + " штук бутылок");
        System.out.println("Задание №5");
        byte allColor = 120;
        byte oneWhite = 2;
        byte oneBrown = 4;
        byte allClassroom = 120 / (2 + 4);
        byte allWhite = (byte) (allClassroom * oneWhite);
        byte allBrown = (byte) (allClassroom * oneBrown);
        System.out.println("В школе, где " + allClassroom + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
        System.out.println("Задание №6");
        byte oneBanana = 80;
        byte totalBanana = 5;
        byte portionMilk = 105;
        byte totalMilk = 2;
        byte portionIcecream = 100;
        byte totalIcecream = 2;
        byte oneEgg = 70;
        byte totalEgg = 4;
        short breakfast = (short)(oneBanana * totalBanana + portionMilk * totalMilk + portionIcecream * totalIcecream + oneEgg * totalEgg);
        float weightreakfast= breakfast / 1000;
        System.out.println("Завтрак спортсмена весит "+ breakfast + " грамм или " + weightreakfast + " кг");
        System.out.println("Задание №7");
        short needLoss = 7000;
        short minLoss = 250;
        short maxLoss = 500;
        short minDay = (short) (needLoss/minLoss);
        short maxDay = (short) (needLoss/maxLoss);
        short midleDay = (short) ((minDay + maxDay)/2);
        System.out.println("При похудении на 7 кг при разных потерях веса спортсмену понадобится: если скидывать в день по 250 г, то " + minDay + " дней, если по 500 г, то " + maxDay + " дней, а средний показатель составит " + midleDay + " день.");
        System.out.println("Задание №8");
        int oldMasha = 67760;
        int oldDenis = 83690;
        int oldKristina = 76230;
        float boost = (float) 1.1;
        float newMasha = oldMasha * boost;
        float newDenis = oldDenis * boost;
        float newKristina = oldKristina * boost;
        float yearMasha = (newMasha - oldMasha) * 12;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + yearMasha + " рублей");
        float yearDenis = (newDenis - oldDenis) * 12;
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + yearDenis + " рублей");
        float yearKristina = (newKristina - oldKristina) * 12;
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + yearKristina + " рублей");
      
        System.out.println("Домашнее заданее №4.Тема: Условный оператор. Часть 1.");
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
System.out.println("Домашнее заданее №5.Тема: Условный оператор. Часть 2.");
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
        int monthV = 0;
        int yearV = monthV/12;
        int startCash = 15_000;
        int precentV = startCash * 7 / 100;
        int totalV = 0;
        while (yearV<10){
            if (monthV%6== 0){
                System.out.println("Месяц " +monthV+ ", год " + yearV + ", сумма накоплений равна: " + totalV + " рублей");
            }
            monthV = monthV+1;
            totalV = totalV+startCash+precentV;
            yearV = monthV/12;
        }
        System.out.println("Задача №7");
        int number = 1;
        while (number < 32){
            System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет.");
            number = number+7;
        }
        System.out.println("Задача №8");
        int yearComet = 0;
        int comet = 79;
        while (yearComet < 2123){
            yearComet= yearComet + comet;
            if (yearComet > 1823 && yearComet < 2123){
                System.out.println(yearComet);
            }
        }
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
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0;i < arr.length;i =i+1) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        int i = 0;
        do {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            i = i + 1;
        } while (i < arr.length);
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
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



