public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир.");
        System.out.println("Hello World!");
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


