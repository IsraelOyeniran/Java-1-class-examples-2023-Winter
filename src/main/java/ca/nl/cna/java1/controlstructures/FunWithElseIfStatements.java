package ca.nl.cna.java1.controlstructures;

import java.util.Scanner;

/**
 * Simple application to demonstrate ELSE IF statements
 *
 *  <pre>
 *  Structure:
 *
 *  {@code
 *  if(condition1){
 *      //execute code if condition is true
 *  } else if (condition2) {
 *      //execute code if condition2 is true (and condition 1 was already false)
 *  ...
 *  } else if (conditionN) {
 *      //execute code if conditionN is true (and condition1 to conditionN-1 was already false)
 *  } else {
 *      //executes if all previous conditions are false
 *  }
 *  }
 *  </pre>
 *
 * @author josh.taylor
 */
public class FunWithElseIfStatements {

    public static void main(String[] args) {
        System.out.println("Fun with ... ELSE IF Statements!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = input.nextInt();

        if(x % 5 == 0){
            System.out.println("The number divides by 5!");
        } else if (x % 5 == 1){
            System.out.println("The number DOES NOT divides by 5, has remainder 1");
        } else if (x % 5 == 2){
            System.out.println("The number DOES NOT divides by 5, has remainder 2");
        } else if (x % 5 == 3){
            System.out.println("The number DOES NOT divides by 5, has remainder 3");
        } else {
            System.out.println("The number DOES NOT divides by 5, has remainder 4");
        }
    }

}
