import java.util.*;
public class decision {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int m,pass=50;
        m=o.nextInt();
        if(m>=pass){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
        o.close();
    }
}
