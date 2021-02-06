/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #2>
Author: Katy Hochstetler
Description: 
*/
import java.util.Scanner;
import java.util.Random;

public class Minilab_2 {

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
    
    public static void PrintArray(int[] userArray) {
        System.out.print("Array: ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.println("");
    }

    public static void FindAverage(int[] userArray) {
        System.out.print("Average: ");
        double total = 0;
        double average = 0;
        for (int i = 0; i < userArray.length; i++) {
            total += (double)userArray[i];
        }
        average = total / userArray.length;
        System.out.println(average + "\n");
    }

    public static void FindLargest(int[] userArray) {
        System.out.print("Largest: ");
        int largest = userArray[0];
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] >= largest) {
                largest = userArray[i];
            }
        }
        System.out.println(largest + "\n");
    }

    public static void FindAmountOfThrees(int[] userArray) {
        System.out.print("3Count: ");
        int countOfThrees = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == 3) {
                countOfThrees++;
            }
        }
        System.out.println(countOfThrees + "\n");
    }

    public static void FindAmountLessThanHalfOfFirst(int[] userArray) {
        System.out.print("Less than half of first: ");
        int countOfIntsLessThanHalfOfFirst = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] <= (double)(userArray[0] / 2)) {
                countOfIntsLessThanHalfOfFirst++;
            }
        }
        System.out.println(countOfIntsLessThanHalfOfFirst + "\n");
    }

    public static void FindAmountOfDuplicates(int[] userArray) {
        System.out.print("Repeats: ");
        int countOfDuplicates = 0;
        for (int i = 0; i < userArray.length; i++) {
            //unsure of how to do this come back later ... 
        }
        System.out.println(countOfDuplicates + "\n");
    }

    public static void SwapElements(int[] userArray) {
        int tempVal = userArray[0];
        userArray[0] = userArray[userArray.length - 1];
        userArray[userArray.length - 1] = tempVal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand;

        final int MAX = 8; 
        long userSeed = 0; 
        int userArraySize = 0; 
        int userChoice = 0;
        int[] userArray;

        System.out.println("Please enter a seed:\n");
        userSeed = scnr.nextLong();

        rand = new Random(userSeed);

        System.out.println("Please enter the size of the array:\n");
        userArraySize = scnr.nextInt();

        while (userArraySize <= 1) {
            System.out.println("Array size must be greater than 1.  Please reenter:\n");
            userArraySize = scnr.nextInt();
        }

        userArray = new int[userArraySize];

        for (int i = 0; i < userArraySize; i++) {
            userArray[i] = rand.nextInt(MAX);
        }

        PrintMenu();
        userChoice = scnr.nextInt();
        System.out.println(""); 

        while (userChoice != 8) {
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
                default:
                    System.out.println("Illegal option, try again");
                    break;        
            }
            PrintMenu();
            userChoice = scnr.nextInt();
        }

        scnr.close();
    }
}
