import java.util.*;
public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int j=0;j<((m-1));j++){
            System.out.print("  ");
        }
        System.out.print("*");
        for(int j=0;j<((m-2));j++){
            System.out.print("  ");
        }
        System.out.println();

        for(int i=2;i<=m;i++){
            for(int k=0;k<(m-i);k++){
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int j=0;j<(i-1);j++){
                System.out.print("  ");
            }

            for(int l=1;l<(i-1);l++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        for(int i=m-1;i>1;i--){
            for(int k=0;k<(m-i);k++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int l=1;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int j=0;j<((m-1));j++){
            System.out.print("  ");
        }
        System.out.print("*");
        for(int j=0;j<((m-2));j++){
            System.out.print("  ");
        }
        sc.close();
    }

    
}
