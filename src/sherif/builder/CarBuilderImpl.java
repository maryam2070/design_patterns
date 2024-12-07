package sherif.builder;

public class CarBuilderImpl implements CarBuilder{
    //private Car car = new Car();
    Integer numOfSeats;
    String engine;
    boolean setGPS;
    boolean setTrip;

//    @Override
//    public CarBuilder reset() {
//        this.car = new Car();
//        return this;
//    }

    @Override
    public CarBuilder setSeats(Integer num) {
        this.numOfSeats = num;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(boolean setTrip) {
        this.setTrip = setTrip;
        return this;
    }

    @Override
    public CarBuilder setGPS(boolean setGPS) {
        this.setGPS = setGPS;
        return this;
    }

    @Override
    public Car build(){
        return new Car(this.numOfSeats, this.engine, this.setGPS, this.setTrip);
    }
}
