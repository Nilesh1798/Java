import java.util.*;
public class gen_paranthesis {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
		
		Paranthesis(a,0,0," ");
		
	}
	public static void Paranthesis(int a,int ope,int clo,String sol) {
		if(ope==a && clo==a) {
		System.out.println(sol);
			
			return;
		}
		if(ope<a) {
			Paranthesis(a,ope+1,clo,sol+"(");
		}
		if(clo<ope) {
			Paranthesis(a,ope,clo+1,sol+")");
		}

    }
}
