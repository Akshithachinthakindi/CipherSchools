public class ForLoopExample {
    public static void main(String[] args) {
        // int i = 100;
        for (int i = 1; i<=10; i+=2){
            if (i==4)
                break;
            System.out.println(i);
        }
        System.out.println("I found the value as 4");
        // System.out.println(i);
    }
}
