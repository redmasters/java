package main.java.io.redmasters.javabuilder.builders;

import main.java.io.redmasters.javabuilder.cars.CarType;
import main.java.io.redmasters.javabuilder.components.Engine;
import main.java.io.redmasters.javabuilder.components.GPSNavigator;
import main.java.io.redmasters.javabuilder.components.Transmission;
import main.java.io.redmasters.javabuilder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}