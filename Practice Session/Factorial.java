import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        long factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        number = input.nextInt();
        input.close();
        if (number < 0) {
            System.out.println("Can't find the factorial of negative number");
        } else if (number <=1) {
            System.out.printf("%d! = %d", number, factorial);
        } else {
            for (int counter = number; counter >= 2; counter--) {
                factorial = factorial * counter;
            }
            System.out.printf("%d! = %d", number, factorial);
        }
    }
}

//    static int factorial (int n) {
//        if (n==0) {
//            return 1;
//        }
//        return n*factorial(n-1);
//    }
//    public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            int arr[] = new int[] {5,6,7,8,9};
//            for (int i=0; i<arr.length; i++) {
//                System.out.println(factorial(arr[i]) + " ");
//            }
//    }