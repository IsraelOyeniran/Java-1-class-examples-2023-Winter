package ca.nl.cna.java1.assignmenthelp.a1;

/**
 * Instructions:
 * Create a class called InvoiceItem that has two attributes:
 * product (Product) and quantity (int).
 * Great getter and setters and a constructor.
 * Create a method called getItemTotal() which calculates the total based on product price and quantity.
 * Don’t let quantity be negative.
 *
 * @author josh.taylor
 */
public class InvoiceItem {

    private Product product;
    private int quantity;

    /**
     *
     * @param product
     * @param quantity
     */
    public InvoiceItem(Product product, int quantity){
        this.product = product;
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    /**
     * Get the product
     * @return product
     */
    public Product getProduct(){
        return this.product;
    }

    /**
     * Set the product
     * @param product product
     */
    public void setProduct(Product product){
        this.product = product;
    }

    /**
     * Get the quantity
     * @return quantity
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Set the quantity
     * @param quantity quantity
     */
    public void setQuantity(int quantity){
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    /**
     * Get the invoice item total
     * @return invoice item total
     */
    public double getItemTotal(){
        return this.getProduct().getPrice() * this.quantity;
    }

}
