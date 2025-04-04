package ex3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setEngine("V8")
                .setSeats(8)
                .setColor("Red")
                .build();

        Car car2 = new Car.CarBuilder()
                .setEngine("V6")
                .setSeats(6)
                .setColor("Blue")
                .build();
        System.out.println(car1);
        System.out.println(car2);
    }
}

