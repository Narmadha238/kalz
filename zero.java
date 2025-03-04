import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "false";
        int a = sc.nextInt();
        while(a>0){
            int r=a%10;
            if(r==0)
                st ="true";
            a =(a/10);
        }
        System.out.println(st);
        sc.close();
    }
}
