/* This class acts as the primary implementation of the
   RecursionProduct class to support all other functionality
   outside of finding a product through a recursive method.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RecursionProduct process = new RecursionProduct();
        int counter = 5;
        int[] numberList = new int[counter];

        // Activity block
        System.out.println("Please provide 5 non-zero whole numbers: ");
        for (int i = 0; i < counter; i++) {
            while (true) {
                int number = input.nextInt();
                if (number != 0 ) { // Check for zeros
                    numberList[i] = number;
                    break;
                } else {
                    System.out.println("Number cannot be zero, please try again!");
                }
            }
        }

        // Output block
        int result = process.productProcess(numberList,counter);
        System.out.println("The product of the provided numbers is: " + result);
        input.close();
    }
}
