import sherif.builder.Car;
import sherif.builder.CarBuilder;
import sherif.builder.CarBuilderImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CarBuilderImpl carBuilder = new CarBuilderImpl();
        CarBuilder carBuilder1 = new CarBuilderImpl();
        carBuilder1.setGPS(false)
                .setTripComputer(false)
                .setSeats(6)
                .setEngine("Tipo Engine");
        Car fait = carBuilder1.build();


        carBuilder.setGPS(true)
                .setEngine("Volvo Engine")
                .setSeats(5)
                .setTripComputer(true)
                .build();
        Car volvo = carBuilder.build();


        System.out.println(volvo.toString());
        System.out.println(fait.toString());
    }
}