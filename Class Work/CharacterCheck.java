import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        // basically here we enter some random character and we check if it is
        // an alphabet or not.
        // for example: char ch = '#'
        // we check whether if it lies between a-z or A-Z
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = input.next().charAt(0);

        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            System.out.println("It's an Alphabet");
        } else {
            System.out.println("It's not an Alphabet");
        }
    }
}