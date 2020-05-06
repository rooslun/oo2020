public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", CarType.SPORT, CarColorType.WHITE);
        car1.action();
        Car car2 = new Car("Range Rover", CarType.PERE, CarColorType.BLACK);
        car2.action();
    }
}