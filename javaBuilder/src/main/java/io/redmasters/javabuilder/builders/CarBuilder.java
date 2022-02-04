package main.java.io.redmasters.javabuilder.builders;

import main.java.io.redmasters.javabuilder.cars.Car;
import main.java.io.redmasters.javabuilder.cars.CarType;
import main.java.io.redmasters.javabuilder.components.Engine;
import main.java.io.redmasters.javabuilder.components.GPSNavigator;
import main.java.io.redmasters.javabuilder.components.Transmission;
import main.java.io.redmasters.javabuilder.components.TripComputer;

public class CarBuilder implements Builder{
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

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {

    }

    public Car getResult(){
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
