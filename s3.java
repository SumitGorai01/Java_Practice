/*
wap in java for series 1^1/1+2^2/2+3^3/3+..........+n^n/n?
*/
import java.util.*;
class s3
{
public static void main(String aj[])
{
int n,i, s1=0;
Scanner s=new Scanner (System.in);
System.out.println("Enter a no where u want to find sum of even no:");
n=s.nextInt();

for(i=1;i<=n;i++)
{
s1=(int)(s1+Math.pow(i,i-1));
}
System.out.println("sum="+s1);
}
}