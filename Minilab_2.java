/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #2>
Author: Katy Hochstetler
Description: In this mini lab the user is asked to type in a seed integer and the amount of integers for an array. 
The user is presented with a menu of options to manipulate the array or calculate statistics. 
*/
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Minilab_2 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userSeed = 0; 
        int userArraySize = 0; 
        int userChoice = 0;
        int[] userArray;

        System.out.println("Please enter a seed:");
        userSeed = scnr.nextInt();

        System.out.println("\nPlease enter the size of the array:");
        userArraySize = scnr.nextInt();

        while (userArraySize <= 1) {
            System.out.println("Array size must be greater than 1.  Please reenter:\n");
            userArraySize = scnr.nextInt();
        }

        userArray = new int[userArraySize];

        GenerateRandomNumbers(userArray, userSeed);

        do {
            PrintMenu();
            userChoice = scnr.nextInt();
            System.out.println(""); 

            switch (userChoice) {
                case 1:
                    PrintArray(userArray);
                    break;
                case 2: 
                    FindAverage(userArray);
                    break;
                case 3:
                    FindLargest(userArray);
                    break;
                case 4:
                    FindAmountOfThrees(userArray);
                    break;
                case 5:
                    FindAmountLessThanHalfOfFirst(userArray);
                    break;
                case 6:
                    FindAmountOfDuplicates(userArray);
                    break;
                case 7:
                    SwapElements(userArray);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Illegal option, try again");
                    break;        
            }
        } while (userChoice != 8);

        scnr.close();
    }

    // This method prints the user menu.
    public static void PrintMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("\t1. Print the array");
        System.out.println("\t2. Find the average");
        System.out.println("\t3. Find the largest element");
        System.out.println("\t4. Count how many times 3 occurred");
        System.out.println("\t5. Count how many elements are less than half of the first element");
        System.out.println("\t6. Find how many times numbers repeat consecutively");
        System.out.println("\t7. Swap the first and last elements");
        System.out.println("\t8. Exit\n");
    }
 
    // This method prints the array of integers that were generated.
    public static void PrintArray(int[] userArray) {
        System.out.print("Array: ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + "  ");
        }
        System.out.println("");
    }

    // This method finds the average value from the generated integers 
    public static void FindAverage(int[] userArray) {
        System.out.print("Average: ");
        double total = 0;
        double average = 0;

        for (int i = 0; i < userArray.length; i++) {
            total += (double)userArray[i];
        }

        average = total / userArray.length;
        if (average - Math.floor(average) == 0) {
            System.out.printf("%.1f", average);
        } else {
            System.out.printf("%.3f", average);
        }
        System.out.println("");
    }

    // This method finds the largest value of the generated integers.
    public static void FindLargest(int[] userArray) {
        System.out.print("Largest: ");
        int largest = userArray[0];

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] >= largest) {
                largest = userArray[i];
            }
        }

        System.out.println(largest);
    }

    // This method finds the amount of threes in the generated integers 
    public static void FindAmountOfThrees(int[] userArray) {
        System.out.print("3Count: ");
        int countOfThrees = 0;

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == 3) {
                countOfThrees++;
            }
        }

        System.out.println(countOfThrees);
    }

    // This method finds the amount of integers that are less than half of the first integer
    public static void FindAmountLessThanHalfOfFirst(int[] userArray) {
        System.out.print("Less than half of first: ");
        int countOfIntsLessThanHalfOfFirst = 0;

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] <= (double)(userArray[0] / 2)) {
                countOfIntsLessThanHalfOfFirst++;
            }
        }

        System.out.println(countOfIntsLessThanHalfOfFirst);
    }

    // This method finds the amount of repeats in the generated integers 
    public static void FindAmountOfDuplicates(int[] userArray) {
        System.out.print("Repeats: ");
        int countOfDuplicates = 0;
        int previousNum;

        for (int i = 0; i < userArray.length; i++) {
            if (i != 0) {
                previousNum = userArray[i-1];
                if (previousNum == userArray[i]) {
                    countOfDuplicates++;
                }
            }
        }

        System.out.println(countOfDuplicates);
    }

    // This method swaps the first element with the last element
    public static void SwapElements(int[] userArray) {
        int tempVal = userArray[0];
        userArray[0] = userArray[userArray.length - 1];
        userArray[userArray.length - 1] = tempVal;
    }

    // This method generates the random numbers for the array
    public static void GenerateRandomNumbers(int[] userArray, int userSeed) {
        final int MAX = 8; 
        Random rand = new Random(userSeed);

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = rand.nextInt(MAX + 1);
        }
    }
}
