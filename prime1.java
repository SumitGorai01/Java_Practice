//Q.wap in java to check a no is prime or not?

import java.util.*;
class prime1
{
public static void main(String x[])
{
int n,i,f=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no. to check prime :");
n=s.nextInt();

for(i=1;i<=n;i++)
{
if(n%i==0)
f++;
}
if(f==2)
System.out.println("Number is Prime.");
else
System.out.println("Number is not Prime.");
}
}