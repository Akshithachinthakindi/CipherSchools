import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Leap Year -
//        year should be divisible by 4 and 100
        // if divisible by 400 - Leap year
        // if not - Not a Leap year
        // else not divisible by 100
        // - It's a leap year
        // else not divisible by 4
        // - not a leap year
        // either it can be divisible by 4, 100, 400 - leap year if not
        // not a leap year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Year: ");
        int year = input.nextInt();
        boolean IsLeapYear = false; // assuming that this is not a leap year

        if (year%4 == 0) {

            if (year%100 == 0) {
                // if year is divisible by 100 then it is divisible by 400 also.
                if (year%400 == 0) {
                    IsLeapYear = true;
                } else {
                    IsLeapYear = false;
                }
            } else {
                IsLeapYear = true;
            }
        }
        if (IsLeapYear) {
            System.out.println("It's a Leap Year");
        } else {
            System.out.println("It's not a Leap Year");
        }
    }
}
