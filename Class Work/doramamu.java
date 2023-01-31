public class doramamu {
    public static void main(String[] args) {
        boolean doramamu = false;
        int i = 0;
        while (doramamu == false) {
            System.out.print(i);
            System.out.println(" Are you ready to Bargain ?");
            if (i==10) {
                doramamu = true;
            }
            i++;
        }
        System.out.println("Dr. Strange Won !");
    }
}
