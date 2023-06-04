import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sx=new Scanner(System.in);
        int n=sx.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sx.nextInt();
        }
        int q=sx.nextInt();
        for(int i=0;i<q;i++){
            int A=sx.nextInt();
            int k=sx.nextInt();
            alex(arr,q,A,k);
        }

    }
    public static void alex(int []arr,int q,int a,int k){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(a%arr[i]==0){
                c+=1;
            }
        }
        if(c>=k){
            System.out.println("Yes");
        }
        else
                    System.out.println("No");

        
    }
}
