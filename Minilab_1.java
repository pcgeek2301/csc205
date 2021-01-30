/*
Put description up here 
*/
import java.util.Scanner;
import java.util.Vector;

import java.lang.Math;

public class Minilab_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final int CAP = 5; 

        int userInt = scnr.nextInt();
        int totalDoubles = 0;
        int totalGreaterThanHalfOfInt = 0;
        int totalMultiplesOfInt = 0;
        int totalWithinFiveOfInt = 0;

        double currentDouble; 
        Vector<Double> userDoubles = new Vector<Double>();
       
        System.out.println("Please enter a non-zero integer");
        
        while (userInt == 0) {
            System.out.println("Number cannot be zero; please reenter");
            userInt = scnr.nextInt();
        }

        System.out.println("Please enter doubles to analyze (negative to stop)");
        
        currentDouble = scnr.nextDouble();

        while (currentDouble >= 0) {
            userDoubles.add(currentDouble);
            currentDouble = scnr.nextDouble();
        }

        totalDoubles = userDoubles.size();

        for (int i = 0; i < userDoubles.size(); i++) {
            if (userDoubles.get(i) > (userInt / 2)) {
                totalGreaterThanHalfOfInt++;
            }

            if (userDoubles.get(i) % userInt == 0) {
                totalMultiplesOfInt++;
            }

            if (Math.abs(userDoubles.get(i) - userInt) <= CAP) {
                totalWithinFiveOfInt++;
            } 
        }

        System.out.println("How many doubles were analyzed? " + totalDoubles);
        System.out.println("How many are greater than half of " + userInt + "? "+ totalGreaterThanHalfOfInt);
        System.out.println("How many are multiples of " + userInt + "? " + totalMultiplesOfInt);
        System.out.println("How many are within 5 of " + userInt + "? " + totalWithinFiveOfInt);

        scnr.close();
    }
}
