package main.java.io.redmasters.javabuilder.director;

import main.java.io.redmasters.javabuilder.builders.Builder;
import main.java.io.redmasters.javabuilder.cars.CarType;
import main.java.io.redmasters.javabuilder.components.Engine;
import main.java.io.redmasters.javabuilder.components.GPSNavigator;
import main.java.io.redmasters.javabuilder.components.Transmission;
import main.java.io.redmasters.javabuilder.components.TripComputer;

public class Director {
    public void constructSportScar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
