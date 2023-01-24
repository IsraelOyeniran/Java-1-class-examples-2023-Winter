package ca.nl.cna.java1.objects;

/**
 * A simple car object that tracks make, model, year for a car.
 *
 * @author josh.taylor
 */
public class Car {

    private String make;
    private String model;
    private int year;

    /**
     * Constructor that takes make, model and year
     * @param make make
     * @param model model
     * @param year year
     */
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * Get the make
     * @return make
     */
    public String getMake(){
        return make;
    }

    /**
     * Set the make
     * @param make make
     */
    public void setMake(String make){
        this.make = make;
    }

    /**
     * Get the model
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the model
     * @param model model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the year
     * @param year year
     */
    public void setYear(int year) {
        this.year = year;
    }
}
