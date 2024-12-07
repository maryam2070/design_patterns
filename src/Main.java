import sherif.builder.Car;
import sherif.builder.CarBuilder;
import sherif.builder.CarBuilderImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarBuilderImpl carBuilder = new CarBuilderImpl();
        CarBuilder carBuilder1 = new CarBuilderImpl();
        carBuilder.setGPS(true)
                .setEngine("engine")
                .setSeats(10)
                .setTripComputer(false)
                .build();
        Car car = carBuilder.build();
        System.out.println(car.toString());
        System.out.println(carBuilder.toString());
    }
}