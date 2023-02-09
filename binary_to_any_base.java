import java.util.*;
public class anybase_to_dec {
    public static void main(String[]args){

    
   
    Scanner sc=new Scanner(System.in);
    int sn=sc.nextInt();
    int sb=sc.nextInt();
    Change(sn,sb);
    sc.close();

}

public static void Change(int sn , int sb){

    int mult=1;
    int ans=0;
    while(sn!=0){
        int rem=sn%10;
          ans=ans+(rem*mult);
          mult=mult*sb;
         sn=sn/10;


    }
    System.out.println(ans);
    

}

}
