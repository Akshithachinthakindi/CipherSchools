public class Program1 {
    public static void main(String[] args) {
        // In c or c++ String is basically considered as an Array
        // But in Java we do not consider String as an array
        String s = new String("Akshitha");
        for (int i = 0; i<s.length(); i++)
//            if (s.charAt(i) == 't')
//                break;
        System.out.println(s.charAt(i));
       // System.out.println(s[0]); // this does not works in java (gives error)
        // s.length()
        // s.trim()
        // s.substring()
        // s.charAt(int position)
        // these are the methods that we use for string

    }
}
