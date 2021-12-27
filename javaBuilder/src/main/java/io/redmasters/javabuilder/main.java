package main.java.io.redmasters.javabuilder;

import main.java.io.redmasters.javabuilder.builders.CarBuilder;
import main.java.io.redmasters.javabuilder.builders.CarManualBuilder;
import main.java.io.redmasters.javabuilder.cars.Car;
import main.java.io.redmasters.javabuilder.cars.Manual;
import main.java.io.redmasters.javabuilder.director.Director;

public class main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportScar(builder);

        Car car = builder.getResult();
        System.out.println("Carro construido:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportScar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nManual:\n" + carManual.print());
    }
}
