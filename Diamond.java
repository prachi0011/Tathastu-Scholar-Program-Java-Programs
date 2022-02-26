import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n/2; i++){
            for(int j = n/2; j>=i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n/2; i < n; i++){
            for(int j = 0; j<=i-n/2; j++){
                System.out.print(" ");
            }
            for(int j = (n-i)*2 -1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
