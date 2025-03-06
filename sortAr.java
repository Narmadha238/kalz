import java.util.*;
public class sortAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][2];
        for(int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.print("val "+i+" "+j+" = ");
                a[i][j]=sc.nextInt();
                System.out.println();
            }  
        }
        for(int k=0;k<=2;k++){
            for (int l=0;l<2;l++){
                System.out.println(a[k][l]);
            }  
        }
        sc.close();
    }
}
