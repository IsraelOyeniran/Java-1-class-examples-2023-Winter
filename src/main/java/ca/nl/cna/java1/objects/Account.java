package ca.nl.cna.java1.objects;

/**
 * A simple object called account that has a name. This class will be expanded upon.
 *
 * Note: This object is similar to the example at the start of Chapter 3
 *
 * @author Josh
 */
public class Account {

    //This is an attribute
    private String name;

    /**
     * Simple constructor that sets account name
     * @param name name
     */
    public Account(String name) {
        this.name = name;
    }

    /**
     * Get the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
