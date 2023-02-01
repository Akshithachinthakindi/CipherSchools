import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        int r = 0;
        if (n < 0) {
            System.out.println("Invalid Input");
        } else {
            while (n != 0) {
                int remainder = n % 10;
                r = r * 10 + remainder;
                n = n/10;
            }
            System.out.println("Reverse of the Given Number is: " + r);
        }
    }
}
