package sherif.builder;

public class Car {
    Integer numOfSeats;
    String engine;
    boolean setGPS;
    boolean setTrip;

    public Car(){}
    public Car(Integer numOfSeats, String engine, boolean setGPS, boolean setTrip) {
        this.numOfSeats = numOfSeats;
        this.engine = engine;
        this.setGPS = setGPS;
        this.setTrip = setTrip;
    }

    @Override
    public String toString() {
        return "{" +
                " Number of seats =" + numOfSeats +
                ", Type of engine =" + engine +
                ", GPS =" + setGPS +
                ", Trip =" + setTrip +
                '}';
    }

}
