import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int k = ar.length;
        for (int i=0;i<k;i++){
            ar[i] = sc.nextInt();
        }
        int mi = ar[0];
        int ma = ar[0];
        for (int i=0;i<k;i++){
            int r = i+65;
            char c = (char)r;
            System.out.println( c+" = "+ar[i]);
            if(mi>=ar[i]){
                mi = ar[i];
            }
            if(ma<=ar[i]){
                ma = ar[i];
            }
        }
        
        System.out.println("max = "+ma);
        System.out.println("min = "+mi);
        sc.close();
    }
}
