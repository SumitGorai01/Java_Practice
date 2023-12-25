
import java.util.*;
class even
{
even()
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter a no.:");
n=s.nextInt();
if(n%2==0)
System.out.println("Even no");
else
System.out.println("Odd no");
}
public static void main(String ak[])
{
even obj=new even();
}
}