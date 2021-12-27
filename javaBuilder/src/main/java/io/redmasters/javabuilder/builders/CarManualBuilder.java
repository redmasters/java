package main.java.io.redmasters.javabuilder.builders;

import main.java.io.redmasters.javabuilder.cars.CarType;
import main.java.io.redmasters.javabuilder.cars.Manual;
import main.java.io.redmasters.javabuilder.components.Engine;
import main.java.io.redmasters.javabuilder.components.GPSNavigator;
import main.java.io.redmasters.javabuilder.components.Transmission;
import main.java.io.redmasters.javabuilder.components.TripComputer;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult(){
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
