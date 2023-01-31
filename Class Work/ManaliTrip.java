public class ManaliTrip {
    public static void main(String[] args) {
        //Just some basic program to know how to use boolean and '&&' operator
        // --same goes with the '||' operator
        // true && true = true
        // true && false = false
        // false && false = false
        // true || true = true
        // true || false = true
        // false || false = false
        boolean amma = true;
        boolean nanna = true;

        if (amma && nanna) {
            System.out.println("Yay! Trip is ON");
        } else {
            System.out.println("Opps! Trip is OFF");
        }
    }
}
