package ca.nl.cna.java1.assignmenthelp.a1;

public class ProductTester {

    public static void main(String[] args) {

        Product orange = new Product(75, "Orange", 1.99);

        Product apple = new Product(34, "Apple", 1.25);

        orange.setPrice(2.45);

        printProductDetails(orange);

        printProductDetails(apple);

    }

    public static void printProductDetails(Product product){
        System.out.printf("\nProduct details -  id: %d, %s, $%.2f", product.getId(), product.getDescription(), product.getPrice());
    }

}
