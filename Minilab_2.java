/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Minilab: <Minilab #2>
Author: Katy Hochstetler
Description: 
*/
public class Minilab_2 {

    public void PrintMenu() {
        System.out.println("Please choose an option:");
        System.out.println("\t1. Print the array");
        System.out.println("\t2. Find the average");
        System.out.println("\t3. Find the largest element");
        System.out.println("\t4. Count how many times 3 occurred");
        System.out.println("\t5. Count how many elements are less than half of the first element");
        System.out.println("\t6. Find how many times numbers repeat consecutively");
        System.out.println("\t7. Swap the first and last elements");
        System.out.println("\t8. Exit");
    }
    
    public void PrintArray(int[] userArray) {
        System.out.print("Array: ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]);
        }
    }

    public double FindAverage(int[] userArray) {
        double total = 0;
        double average = 0;
        for (int i = 0; i < userArray.length; i++) {
            total += userArray[i];
        }
        average = total / userArray.length;
        return average;
    }

    public int FindLargest(int[] userArray) {
        int largest = userArray[0];
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] >= largest) {
                largest = userArray[i];
            }
        }
        return largest;
    }

    public int FindAmountOfThrees(int[] userArray) {
        int countOfThrees = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == 3) {
                countOfThrees++;
            }
        }
        return countOfThrees;
    }

    public int FindAmountLessThanHalfOfFirst(int[] userArray) {
        int countOfIntsLessThanHalfOfFirst = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] <= (double)(userArray[0] / 2)) {
                countOfIntsLessThanHalfOfFirst++;
            }
        }
        return countOfIntsLessThanHalfOfFirst;
    }

    public int FindAmountOfDuplicates(int[] userArray) {
        int countOfDuplicates = 0;
        for (int i = 0; i < userArray.length; i++) {
            //unsure of how to do this come back later ... 
        }
        return countOfDuplicates;
    }

    public void SwapElements(int[] userArray) {
        int tempVal = userArray[0];
        userArray[0] = userArray[userArray.length - 1];
        userArray[userArray.length - 1] = tempVal;
    }

    public static void main(String[] args) {

    }
}
