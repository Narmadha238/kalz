import java.util.*;
public class basis{
    public static void main(String ar[]){
        Scanner obj = new Scanner(System.in);
        int sum=0;
        String name =  obj.nextLine();
        int n = obj.nextInt();
        String st[]= new String[n];
        int subname[]= new int[n];
        for(int i=0;i<n;i++){
            subname[i] = obj.nextInt();
            sum = sum+subname[i];
        int pass=50;
        if(subname[i]>=pass){
            st[i]="pass";
        }
        else{
            st[i]="fail";
        }
    }
        System.out.println("name : "+name);
        for (int j=0;j<n;j++){
            System.out.println("sub "+(j+1)+" : "+subname[j]+" "+st[j]);
        }
        float avg = sum/n;
        System.out.println("avg : " + avg);
        obj.close();
    }
}