public class ServiceStation extends Bicycle {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName());
            for (int i = 0; i < car.wheelsCount; i++) {
                car.repairTires();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName());
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.repairTires();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName());
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.repairTires();
            }
        }
    }
}