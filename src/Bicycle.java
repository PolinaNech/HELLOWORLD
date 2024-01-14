public class Bicycle extends Repairable {
    public String modelName;
    public int wheelsCount;

    @Override
    public void repair() {
        System.out.println("Меняем покрышку");
    }
}
