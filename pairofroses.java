import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sx=new Scanner(System.in);
        int n=sx.nextInt();
        for(int i=0;i<n;i++){
            int r=sx.nextInt();
            int []arr=new int[r];
            for(int j=0;j<r;j++){
                arr[j]=sx.nextInt();
            }
            int m=sx.nextInt();
          
            
             System.out.println();
         Arrays.sort(arr);
            deepak(arr,m);
        }

    }
    public static void deepak(int []arr,int m){
      
        int f=0;int s=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                 
                if(arr[i]+arr[j]==m ){
                  int diff=arr[j]-arr[i];
                      if(diff<=min){
                          min=diff;
                          f=arr[i];
                          s=arr[j];
                      }

                
                }
            }
        }
      System.out.println("Deepak should buy roses whose prices are "+f+" and "+s+".");

    }
}
