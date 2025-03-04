import java.util.*;

public class sumdigit {
    public static void main(String[] args) {
        int su=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            su = su+(a%10);
            a =(a/10);
        }
        System.out.println(su);
        sc.close();
    }
}
