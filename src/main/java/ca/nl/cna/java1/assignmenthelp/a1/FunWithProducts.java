package ca.nl.cna.java1.assignmenthelp.a1;

public class FunWithProducts {

    public static void main(String[] args) {
        System.out.println("Fun with Products!");

        //TODO Do something similar for InvoiceItems NOT products - this is an example only

        //Create a new product array with 10 objects
        Product[] productArray = new Product[10];

        //This is how you create and print a product
        productArray[0] = new Product(101, "Carton of Milk", 4.99);
        printProductInfo(productArray[0]);

        productArray[1] = new Product(102, "Orange Juice", 7.99);
        printProductInfo(productArray[1]);

    }

    public static void printProductInfo(Product product){
        System.out.printf("\nProduct info: %d, %s, $%.2f", product.getId(), product.getDescription(), product.getPrice());
    }


}
