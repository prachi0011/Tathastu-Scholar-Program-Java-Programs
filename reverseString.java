
import java.util.*;
public class reverseString {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = reverse(s);
        System.out.println(s);

    }
    private static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.substring(0, 1);
    }
}
