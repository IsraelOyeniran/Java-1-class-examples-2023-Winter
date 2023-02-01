package ca.nl.cna.java1.assignmenthelp.a1;

/**
 * Simple product class for assignment 1. Will represent products on line items on invoices.
 *
 * @author
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Simple product constructor with all attributes
     * @param id id
     * @param description description
     * @param price price (can't be negative)
     */
    public Product(int id, String description, double price){
        this.id = id;
        this.description = description;
        //TODO make sure this isn't negative ;)
        this.price = price;
    }

    /**
     * Get the id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price
     * @param price price
     */
    public void setPrice(double price) {
        //TODO make sure it's not negative ;)
        this.price = price;
    }
}
