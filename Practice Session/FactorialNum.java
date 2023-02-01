import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        // ques : Print the factorial of numbers in a range
        // relation between the input and output
        // 1 to 5 range factorials
        // 1 2 6 24 120
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int rangeStart = input.nextInt();
        System.out.print("Enter your second number: ");
        int rangeEnd = input.nextInt();
        int fact =1;
        for (int i=rangeStart; i<=rangeEnd; i++) {
            fact = fact*i;
            System.out.println("The Factorial of " + i +" is: " + fact);
        }
    }
}
