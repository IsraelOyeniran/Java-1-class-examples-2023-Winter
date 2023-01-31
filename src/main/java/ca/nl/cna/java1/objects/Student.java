package ca.nl.cna.java1.objects;

/**
 * Student class example from Chapter 4 notes
 *
 * Student has a name and an average. There is a letter grade derived from the average.
 *
 * @author josh.taylor
 */
public class Student {

    private String name;
    private double average;

    /**
     * Simple constructor. Average must be between 0 and 100
     * @param name student name
     * @param average between 0 and 100, set to 0 otherwise
     */
    public Student(String name, double average){
        this.name = name;
        if(average >= 0 && average <= 100){
            this.average = average;
        }
    }

    /**
     * Get the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the average
     * @return average
     */
    public double getAverage() {
        return average;
    }

    /**
     * Set the average. Average must be between 0 and 100
     * @param average between 0 and 100, set to 0 otherwise
     */
    public void setAverage(double average) {
        if(average >= 0 && average <= 100){
            this.average = average;
        }
    }

    /**
     * Get the letter grade. 0 to less than 60 is an F, 60 to less than 70 is a D, 70 to less 80 is a C,
     * 80 to less 90 is a B, 90 to 100 is an A.
     * @return grade as a letter
     */
    public String getGradeLetter(){
        String grade = "";

        if(this.average >= 90){
            grade = "A";
        } else if(this.average >= 80){
            grade = "B";
        } else if(this.average >= 70){
            grade = "C";
        } else if (this.average >= 60){
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }
}
