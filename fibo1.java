
import java.util.*;
public class fibo1{

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		int a=-1,b=1,c,i,n;
	        System.out.println("Enter how many terms:");
	        n=s.nextInt();
	        for(i=1;i<=n;i++)
	        {
	            c=a+b;
	            System.out.print(c+"\t");
	            a=b;
	            b=c;
	        }
	    }
}