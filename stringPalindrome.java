

public class stringPalindrome {
    public static void main(String[] args) {
        System.out.println("ABA--" +isPalindrome("ABA"));
        System.out.println("ABC--" +isPalindrome("ABC"));
    }
    private static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.substring(0, 1);
    }
    public static boolean isPalindrome(String s){
        String rev = reverse(s);
        return rev.equals(s);
    }
}
