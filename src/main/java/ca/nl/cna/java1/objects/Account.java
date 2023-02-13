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
    private double balance;

    /**
     * Simple constructor that sets account name
     * @param name name
     */
    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
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

    /**
     * Get the balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Credit an amount into the account. If amount is negative the deposit is ignored.
     * @param amount amount (must be greater than 0)
     */
    public void credit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }

    /**
     * Debit (withdraw) an amount from the account. If there is insufficient funds or if the amount is negative
     * nothing will happen to the account balance
     * @param amount amount attempted to withdraw (must be greater than 0)
     */
    public void debit(double amount){
        //TODO check that amount is not negative and that you have enough money to debit this amount!
    }

}
