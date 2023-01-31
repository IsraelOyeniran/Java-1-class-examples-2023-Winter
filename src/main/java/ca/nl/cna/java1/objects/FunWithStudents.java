package ca.nl.cna.java1.objects;

import java.util.Random;

public class FunWithStudents {

    public static void main(String[] args) {
        System.out.println("Fun with Students");

        Random random = new Random();

        Student student = new Student("Joshy", random.nextInt(50) + 50);

        System.out.printf("%s has an average of %.0f and a letter grade of %s",
                student.getName(), student.getAverage(), student.getGradeLetter());

    }

}
