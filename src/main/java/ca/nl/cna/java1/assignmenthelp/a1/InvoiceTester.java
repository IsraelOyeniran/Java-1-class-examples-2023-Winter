package ca.nl.cna.java1.assignmenthelp.a1;

/**
 * You can use this type of class to demonstrate you invoice
 *
 * @author Josh
 */
public class InvoiceTester {

    public static void main(String[] args) {
        System.out.println("Fun with Invoices!");

        //Create the products
        Product product1 = new Product(101, "Carton of Milk", 4.99);
        Product product2 = new Product(102, "Orange Juice", 6.99);
        Product product3 = new Product(107, "Loaf of Bread", 3.99);


        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 2);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 1);
        InvoiceItem invoiceItem3 = new InvoiceItem(product3, 3);


        //TODO Create and add to an invoice

        //TODO Print the invoice showing the totals

    }

    public static void printInvoice(Invoice invoice){
        System.out.println("Invoice Details");

        //TODO write this method
        //TODO add a table head with ID, Description, QTY, Unit Price, Line Total

        //TODO make sure it's properly formatted. Use %XS to space strings

        //TODO Add the invoice total

    }

}
