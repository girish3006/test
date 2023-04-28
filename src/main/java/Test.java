public class Test {

    public static void main(String[] args) {

        RaceCar racer = new RaceCar();
        Car car = new RaceCar();
        Vehicle vehicle = new RaceCar();

        System.out.println(racer.speed() + ", " + car.speed() + ", " + vehicle.speed());
    }
}
