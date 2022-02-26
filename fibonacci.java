import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        System.out.print(fib1 + " " + fib2+" ");
        int i = 3;
        while(i <= n){
            int temp = fib1;
            fib1 = fib2;
            fib2 = temp + fib1;
            System.out.print(fib2+" ");
            i++;
        }

    }
}
