package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarManualBuilder;
import creational.builder.builders.Director;
import creational.builder.entity.Car;
import creational.builder.entity.Manual;

public class DemoBulder {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
