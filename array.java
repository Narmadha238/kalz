import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int su = 0;
        int k = ar.length;
        for (int i=0;i<k;i++){
            ar[i] = sc.nextInt();
            su=su+ar[i];
        }
        for (int i=0;i<k;i++){
            int r = i+65;
            char c = (char)r;
            System.out.println( c+" = "+ar[i]);
        }
        System.out.println("Sum of Array = "+su);
        sc.close();
    }
}
