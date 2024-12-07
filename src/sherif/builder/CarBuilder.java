package sherif.builder;

public interface CarBuilder {
     //CarBuilder reset();
     CarBuilder setSeats(Integer num);
     CarBuilder setEngine(String engine);
     CarBuilder setTripComputer(boolean setTrip);
     CarBuilder setGPS(boolean setGPS);
     Car build();
}
