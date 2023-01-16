package ca.nl.cna.java1.introduction;

import java.util.Scanner;

/**
 * Playing around with console input
 *
 * @author josh.taylor
 */
public class FunWithScanner {

    public static void main(String[] args) {
        System.out.println("Fun with Scanner!");

        int firstNumber, secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        firstNumber = input.nextInt();

        System.out.println("Input second number: ");
        secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.printf("\nYou entered: %d", sum);


    }

}
