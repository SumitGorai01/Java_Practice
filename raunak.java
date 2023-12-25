import java.util.*;
class raunak
{
public static void main(String aj[])
{
Scanner s=new Scanner(System.in);
System.out .println("enter no.");
int n=s.nextInt();
int i=n;

if(i%2!=0)
{
System.out.println("weird");
}
if(i>=2&&i<=5)
{
if(i%2==0)
{
System.out.println("not weird");
}
}
if(i>=6&&i<=20)
{
if(i%2==0)
{
System.out.println("weird");
}
}
if(i>20)
{
if(i%2==0)
System.out.println("not weird");
}
}
}