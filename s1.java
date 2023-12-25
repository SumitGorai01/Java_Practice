/*
wap in java to print the series 1+2+3+......+n ?
*/
import java.util.*;
class s1
{
public static void main(String aj[])
{
int n,i, s1=0;
Scanner s=new Scanner (System.in);
System.out.println("Enter a no where u want to find sum of even no:");
n=s.nextInt();

for(i=1;i<=n;i++)
{
s1=(i*(i+1)/2);
}
System.out.println("sum="+s1);
}
}