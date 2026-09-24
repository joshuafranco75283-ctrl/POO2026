public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car("a75b");
        Motorcycle motorcycle = new Motorcycle(500);
        int carSpeed = car.acelerate(1);
        int motorcycleSpeed = motorcycle.acelerate(1);
        System.out.println("car speed: " + carSpeed + "km/h");
        System.out.println("motorcycle speed: "+ motorcycleSpeed+ "km/h");
    }
}
