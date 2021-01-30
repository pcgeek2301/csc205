/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #1>
Author: Katy Hochstetler
Description: In this lab, a user will first be prompted to enter in a non-zero integer. It will continue to prompt until given 
non-zero integer. Then the user is prompted to enter in doubles, using a negative number to stop. Then the program will display 
the number of doubles, the amount of doubles that are greater than half of the non-zero integer, the amount of doubles
that are multiples of the non-zero integer, and how many doubles are within five of the non-zero integer.
*/
import java.util.Scanner;
import java.util.Vector;
import java.lang.Math;

public class Minilab_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //constant variable for the threshold test
        final int CAP = 5; 

        int userInt;
        int countOfDoubles = 0;
        int countOfDoublesGreaterThanHalfOfInt = 0;
        int countOfDoublesThatAreMultiplesOfInt = 0;
        int countOfDoublesWithinFiveOfInt = 0;

        double currentUserDouble; 
        Vector<Double> userDoubles = new Vector<Double>();
       
        System.out.println("Please enter a non-zero integer");

        userInt = scnr.nextInt();

        //continues to check user input until the integer is non-zero
        while (userInt == 0) {
            System.out.println("Number cannot be zero; please reenter");
            userInt = scnr.nextInt();
        }

        //puts a line before and after for formatting purposes
        System.out.println("\n" + "Please enter doubles to analyze (negative to stop)" + "\n");
        
        currentUserDouble = scnr.nextDouble();

        //continues to put the doubles the user enters into a vector until user enters a negative
        while (currentUserDouble >= 0) {
            userDoubles.add(currentUserDouble);
            currentUserDouble = scnr.nextDouble();
        }

        countOfDoubles = userDoubles.size();

        for (int i = 0; i < countOfDoubles; i++) {
            //checks if each user double is greater than half of non-zero int
            if (userDoubles.get(i) > ((double)userInt / 2)) {
                countOfDoublesGreaterThanHalfOfInt++;
            }

            //checks if each user double is a multiple of the non-zero int
            if (userDoubles.get(i) % userInt == 0) {
                countOfDoublesThatAreMultiplesOfInt++;
            }

            //checks if each user double is within 5 of the non-zero int
            if (Math.abs(userDoubles.get(i) - userInt) <= CAP) {
                countOfDoublesWithinFiveOfInt++;
            } 
        }

        System.out.println("How many doubles were analyzed? " + countOfDoubles);
        System.out.println("How many are greater than half of " + userInt + "? "+ countOfDoublesGreaterThanHalfOfInt);
        System.out.println("How many are multiples of " + userInt + "? " + countOfDoublesThatAreMultiplesOfInt);
        System.out.println("How many are within 5 of " + userInt + "? " + countOfDoublesWithinFiveOfInt);

        scnr.close();
    }
}
