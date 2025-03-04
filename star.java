import java.util.*;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 5;
        for(int i =m;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
