import java.util.*;
public class frequencyAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int k=(j+1);k<n;k++){
                if(ar[j] == ar[k]){
                    
                }
            }
        }
    }
}
