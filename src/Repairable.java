public interface Repairable {
    default void repairTires() {
        System.out.println("Меняем покрышку");
    }
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

