import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ar = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int[][] t = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                t[i][j] = ar[j][i];
            }
        }
        System.out.println("Transpose--");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(t[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
