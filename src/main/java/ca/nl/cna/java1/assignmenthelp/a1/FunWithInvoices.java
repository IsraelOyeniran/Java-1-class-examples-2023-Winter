package ca.nl.cna.java1.assignmenthelp.a1;

/**
 * Use this class to create the invoice for the assignment!
 *
 * @author Josh
 */
public class FunWithInvoices {

    public static void main(String[] args) {
        System.out.println("Fun with Invoices!");

        //TODO change these to reflect the assignment
        Product product1 = new Product(101, "Carton of Milk", 4.99);
        Product product2 = new Product(102, "Orange Juice", 6.99);
        Product product3 = new Product(107, "Loaf of Bread", 3.99);

        InvoiceItem invoiceItem1 = new InvoiceItem(product1, 2);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2, 1);
        InvoiceItem invoiceItem3 = new InvoiceItem(product3, 3);

        Invoice invoice = new Invoice();
        invoice.addInvoiceItem(invoiceItem1);
        //TODO Finish adding invoice items (there should be 4)

        printInvoice(invoice);  //TODO Finish this method

    }

    public static void printInvoice(Invoice invoice){
        System.out.println("Invoice Details");

        //TODO write this method
        //TODO add a table head with ID, Description, QTY, Unit Price, Line Total
        //TODO make sure it's properly formatted. Use %XS to space strings

        //TODO write a for loop on the invoiceItems (use number of items)
        for (int i = 0; i < invoice.getNumberItems(); i++) {
            //You can use the print format from InvoiceItem Tester but clean it up
        }

        //TODO Add the invoice total at the bottom

    }

}
