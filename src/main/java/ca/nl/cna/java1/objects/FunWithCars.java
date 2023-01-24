package ca.nl.cna.java1.objects;

/**
 * Simple class to play around with the Car object
 *
 * @author josh.taylor
 */
public class FunWithCars {

    public static void main(String[] args){
        System.out.println("Fun with Cars!");

        Car firstCar = new Car("Ford", "F150", 2012);
        printCarDetails(firstCar);

        Car secondCar = new Car("Toyota", "Yaris", 2020);
        printCarDetails(secondCar);

    }

    public static void printCarDetails(Car car){
        System.out.printf("\nCar: %s / %s / %d", car.getMake(), car.getModel(), car.getYear());
    }

}
