import java.util.Scanner;
public class ScratchWork {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        boolean endStatement = false; 
        int A = 0;
        int B = 0;
        int C = 0;

        System.out.println("Enter in A");
        A = GetNumber(scnr);
        System.out.println("Enter in B");
        B = GetNumber(scnr);
        System.out.println("Enter in C");
        C = GetNumber(scnr);

        if ((A != 1) || (B == 1 && C == 1)) {
            endStatement = true;
        }

        System.out.println("The expression is " + endStatement);

    }

    public static int GetNumber(Scanner scnr) {
        int number = scnr.nextInt();
        while (number != 0 && number != 1) {
            System.out.println("Must be 0 or 1, please reenter");
            number = scnr.nextInt();
        }
        return number;
    }
}