import java.util.*;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int co = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='u'||c=='o'||c=='A'||c=='E'||c=='I'||c=='U'||c=='O'){
                co++;
                System.out.println("vowel "+c);
            }
        }
        if(co!=0){
            System.out.println("It contain vowel");
        }
        else{
            System.out.println("it dont't have vowel");
        }
        sc.close();
    }
}
