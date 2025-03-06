import java.util.*;
public class strReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r="";
        char ar[] = s.toCharArray();
        for (int i=s.length()-1;i>=0;i--){
            r=r+ar[i];
        }
        if(r.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
    
}
