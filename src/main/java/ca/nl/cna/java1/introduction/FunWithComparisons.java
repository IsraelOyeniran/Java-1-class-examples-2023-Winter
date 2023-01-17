package ca.nl.cna.java1.introduction;

import java.util.Scanner;

/**
 * Fun with comparing integers
 *
 * @author josh.taylor
 */
public class FunWithComparisons {

    public static void main(String[] args) {
        System.out.println("Fun with Comparisons!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int x = input.nextInt();

        System.out.println("Enter the second integer:");
        int y = input.nextInt();

        System.out.println("Let's compare the numbers");

        if(x == y){
            System.out.printf("\n%d == %d", x, y);
        }

        if(x != y){
            System.out.printf("\n%d != %d", x, y);
        }

        if(x > y){
            System.out.printf("\n%d > %d", x, y);
        }

        if(x < y){
            System.out.printf("\n%d < %d", x, y);
        }

        if(x >= y){
            System.out.printf("\n%d >= %d", x, y);
        }

        if(x <= y) {
            System.out.printf("\n%d <= %d", x, y);
        }

    }

}
