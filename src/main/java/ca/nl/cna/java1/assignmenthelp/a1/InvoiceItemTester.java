package ca.nl.cna.java1.assignmenthelp.a1;

public class InvoiceItemTester {

    public static void main(String[] args) {
        System.out.println("Fun with InvoiceItems");

        Product orange = new Product(75, "Orange", 1.99);

        InvoiceItem invoiceItem = new InvoiceItem(orange, 6);

        printInvoiceItem(invoiceItem);

    }

    public static void printInvoiceItem(InvoiceItem invoiceItem){
        System.out.printf("\nID: %d, %s, $%.2f, QTY: %d, Total: $%.2f",
                invoiceItem.getProduct().getId(),
                invoiceItem.getProduct().getDescription(),
                invoiceItem.getProduct().getPrice(),
                invoiceItem.getQuantity(),
                invoiceItem.getItemTotal()

        );
    }

}
