import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        // Ques : In an array you have to print Second-Largest number.
        // **** Using only ONE FOR LOOP ****
//        Scanner input = new Scanner(System.in);
//        int ArrayNums;
//        System.out.print("Enter array elements: ");
//        int[] n = new int[ArrayNums];
        int[] ArrayNums = {10, 20, 30, 40, 50};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int arrayNum : ArrayNums) {
            if (arrayNum > largest) {
                secondLargest = largest;
                largest = arrayNum;
            } else if (arrayNum > secondLargest && arrayNum != largest) {
                secondLargest = arrayNum;
            }
        }
        System.out.println("Second largest number: " + secondLargest);
    }
}
