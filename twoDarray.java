import java.util.*;
public class twoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ar[][] = new int[m][n];
        for(int i = 0;i<m;i++){
             for(int j=0;j<n;j++){
                ar[i][j] = sc.nextInt();
             }
        }
        for(int k = 0;k<m;k++){
            for(int l=0;l<n;l++){
               System.out.print(ar[k][l]+" ");
            }
            System.out.println();
       }
       sc.close();
    }
}
