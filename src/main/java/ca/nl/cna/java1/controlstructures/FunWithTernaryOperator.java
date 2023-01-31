package ca.nl.cna.java1.controlstructures;

import java.util.Scanner;

/**
 * Fun with the Ternary Operator.
 *
 *
 */
public class FunWithTernaryOperator {

    public static void main(String[] args) {

        System.out.println("Fun with ... IF Statements!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        //This is slick but it's not so easy to read and people might not understand
        //This are best used to avoid if/else return statements - we will see it later
        System.out.println( x % 2 == 0 ? "The number is EVEN!" : "The number is ODD!" );

    }

}
