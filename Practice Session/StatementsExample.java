public class StatementsExample {
    public static void main(String[] args) {
        for (int i=1; i<=16; i++) {
            if (i%15==0)
                System.out.println("Fun Task");
             else if (i%5==0)
                System.out.println("Task");
             else if (i%3==0)
                System.out.println("Fun");
             else
                System.out.println(i);
        }
    }
}
