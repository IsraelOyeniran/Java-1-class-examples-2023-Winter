package ca.nl.cna.java1.objects;

import java.util.Scanner;

public class FunWithAccount {

    public static void main(String[] args) {
        System.out.println("Fun with Accounts!");

        //Declaring an instance of Class Account
        //Instance name is 'account'
        Account account = new Account("Josh's Account", 10.0);

        System.out.printf("\nAccount name: %s", account.getName());
        account.setName("Josh's Shared account");
        System.out.printf("\nAccount name: %s", account.getName());

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter an amount to deposit: ");
        double amount = input.nextDouble();

        account.credit(amount);
        System.out.printf("Account name: %s, balance: $%.2f", account.getName(), account.getBalance());


    }

}
