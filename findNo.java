import java.util.*;
public class findNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0,f=0;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("enter key : ");
        int k = sc.nextInt();
        for(int j=0;j<n;j++){
            if(k==ar[j]){
                c++;
                f = j;
            } 
        }
        if(c!=0){
            System.out.println("Found the key at : "+f);
        }
        else{
            System.out.println("Not Found");
        }
        sc.close();
    }
}
