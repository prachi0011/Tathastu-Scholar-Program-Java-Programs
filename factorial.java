public class factorial {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        System.out.println(fact(n1));
        System.out.println(fact(n2));
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
