package ca.nl.cna.java1.assignmenthelp.a1;

import java.util.Scanner;

/**
 * Simple console Menu Application to use in CP2280
 *
 * @author Josh
 */
public class ApplicationMenuExample {

    public static void main(String[] args) {
        System.out.println("Doing something fun on a Console!");

        Scanner input = new Scanner(System.in);
        char c; //Char to drive menu choice

        do{
            printMenu();
            c = Character.toUpperCase(input.next().charAt(0));  //Grab the user input

            if(c=='A'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            } else  if(c=='B'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            } else if (c=='C'){
                System.out.printf("\nIn Option %c", c);
                //TODO do something
            } else if (c!='Q') {
                System.out.printf("\nOption not recognized. Try Again!");
            }

        }while(c!='Q');

        System.out.println("\nGOODBYE!");
    }

    public static void printMenu(){
        System.out.println("\n\nMake a choice");
        System.out.println("(A) Option A");
        System.out.println("(B) Option B");
        System.out.println("(C) Option C");
        System.out.println("(Q) Quit");
    }

}
