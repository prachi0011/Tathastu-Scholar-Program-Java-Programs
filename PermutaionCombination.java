import java.util.Scanner;

public class PermutaionCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       int nPr = factorial(n) / factorial(n-r);
       int nCr = factorial(n)/(factorial(n-r) * factorial(r));
       System.out.println("Permutation---"+nPr);
       System.out.println("Combination--"+nCr);
       sc.close();
    }

    public static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

}
