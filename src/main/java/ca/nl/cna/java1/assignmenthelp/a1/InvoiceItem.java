package ca.nl.cna.java1.assignmenthelp.a1;

//TODO Document this!
public class InvoiceItem {

    //You can do this!
    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        //TODO make sure this isn't 0
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        //TODO check your quantity value
        this.quantity = quantity;
    }

    public double getTotal(){
        //TODO write this method
        return 0;
    }

}
