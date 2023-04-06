import java.util.*;
public class maze_path {
    static int k=0;
    public static void main(String[] args){
        int n=3;
        int m=4;
        int cr=0;
        int cc=0;
        String ans=""; 
        PrintAnswer(n,m,cc,cr,ans);
        System.out.println(k);
 
    }
    
    public static void PrintAnswer(int n,int m,int cc, int cr,String ans){
        if(cc==m-1 && cr==n-1){
            System.out.println(ans);
            k++;
            return;
        }
        if(cc>=m || cr>=n){
            return;
        }


        PrintAnswer(n,m,cc,cr+1,ans+"V");
        PrintAnswer(n,m,cc+1,cr,ans+"H");
        

    }
}
