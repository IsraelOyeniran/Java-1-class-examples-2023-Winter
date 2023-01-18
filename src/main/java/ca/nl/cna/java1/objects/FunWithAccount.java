package ca.nl.cna.java1.objects;

public class FunWithAccount {

    public static void main(String[] args) {
        System.out.println("Fun with Accounts!");

        Account account = new Account("Josh's Account");

        System.out.printf("\nAccount name: %s", account.getName());


    }

}
