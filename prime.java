import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean st = false;
        int c =0;
        if(a==1 || a==2){
            st=true;
        }
        for (int i=2;i<a;i++){
            if(a%i==0){
                c=c+1;
            }
        }
        if(c==0){
            st=true;
        }
        System.out.println(st);
        sc.close();
    }
}
