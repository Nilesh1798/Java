import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sx=new Scanner(System.in);
        int n=sx.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sx.nextInt();
        }
        int t=sx.nextInt();
      
       Arrays.sort(arr);
        triplet(arr,t);

    }
    public static void triplet(int []arr,int t){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k])==t){
                        System.out.println(arr[i]+","+" "+arr[j]+" and "+arr[k]);
                    }
                }
            }
        }

    }
   
}
