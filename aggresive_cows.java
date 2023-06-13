import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sx=new Scanner(System.in);
        int n=sx.nextInt();
        int c=sx.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sx.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(cows(arr,c));

    }
    public static int cows(int []arr,int c){
        int s=0;
        int e=-1;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            
            e=Math.max(e,arr[i]);
        }
        int mid=s+(e-s)/2;
        while(s<=e){
            if(ispossible(arr,mid,c)){
                 ans=mid;
                s=mid+1;
                }
            else{
                e=mid-1;
            }
             mid=s+(e-s)/2;
             }
             return ans;
    }
    public static boolean ispossible(int []arr,int mid,int v){
        int cow=1;
        int k=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-k>=mid){
                cow++;
                if(cow==v){
                    return true;
                }
                k=arr[i];
            }
        }
        return false;
    }
}
