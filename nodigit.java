import java.util.Scanner;

public class nodigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int a = sc.nextInt();
        while(a>0){
            c = c+1;
            a =(a/10);
        }
        System.out.println(c);
        sc.close();
    }
}
