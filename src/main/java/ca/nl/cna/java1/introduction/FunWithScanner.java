package ca.nl.cna.java1.introduction;

import java.util.Scanner;

/**
 * Playing around with console input
 *
 * Example from Chapter 2 Notes
 *
 * @author josh.taylor
 */
public class FunWithScanner {

    public static void main(String[] args) {
        System.out.println("Fun with Scanner!");

        //ints declared before they are used
        int firstNumber, secondNumber;

        //Create a scanner object to read from the keyboard
        //Scanner is the blueprint, 'input' is the instance
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        firstNumber = input.nextInt();

        System.out.println("Input second number: ");
        secondNumber = input.nextInt();

        //int declared where it is used
        int sum = firstNumber + secondNumber;

        System.out.printf("\nThe sum is: %d", sum);

    }

}
