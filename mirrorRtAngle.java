import java.util.*;
public class mirrorRtAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<((m-i)*2);k++){
                System.out.print("  ");
            }
            for(int l=0;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

