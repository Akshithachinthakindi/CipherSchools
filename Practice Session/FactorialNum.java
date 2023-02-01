import java.util.Scanner;

public class FactorialNum {
    static int fact (int n) {
        if (n==0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            System.out.println(fact(i));
        // ques : Print the factorial of numbers in a range
        // relation between the input and output
        // 1 to 5 range factorials
        // 1 2 6 24 120
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your first number: ");
//         int rangeStart = input.nextInt();
//         System.out.print("Enter your second number: ");
//         int rangeEnd = input.nextInt();
//         int fact =1;
//         for (int i=rangeStart; i<=rangeEnd; i++) {
//             fact = fact*i;
//             System.out.println("The Factorial of " + i +" is: " + fact);
//         }
    }
}
