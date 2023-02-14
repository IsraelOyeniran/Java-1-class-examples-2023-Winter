package ca.nl.cna.java1.assignmenthelp.a1;

public class PrintTester {

    public static void main(String[] args) {
        System.out.println("Fun with printing");

        Product product = new Product(107, "Loaf of Bread", 3.99);


        System.out.printf("ID  \t %-30s \t Price($)", "Description");

        System.out.printf("\n%d \t %-30s \t $%10.2f", product.getId(), product.getDescription(), product.getPrice());


    }

}
