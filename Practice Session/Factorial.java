public class Factorial {
    static int factorial (int n) {
        if (n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            int arr[] = new int[] {5,6,7,8,9};
            for (int i=0; i<arr.length; i++) {
                System.out.println(factorial(arr[i]) + " ");
            }
    }
}
// ques : Print the factorial of numbers in a range
// relation between the input and output
// 1 to 5 range factorials
// 1 2 6 24 120
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your first number: ");
//        int rangeStart = input.nextInt();
//        System.out.print("Enter your second number: ");
//        int rangeEnd = input.nextInt();
//        int fact =1;
//        for (int i=rangeStart; i<=rangeEnd; i++) {
//            fact = fact*i;
//            System.out.println("The Factorial of " + i +" is: " + fact);
//        }