//wap in java to check two no.s are twins prime or not??

import java.util.*;
class twinprime
{
public static void main(String aj[])
{
int n,i,j,c=0,d=0;
Scanner s=new Scanner(System.in);

System.out.println("Enter A");
int a=s.nextInt();

System.out.println("Enter B");
int b=s.nextInt();

System.out.println("checking A is prime :");
for(i=1;i<=a;i++)
{
if(a%i==0)
c++;
}
if(c==2)
System.out.println("A is prime no:"+a);
else
System.out.println("A is not prime no");

System.out.println("checking B is prime:");
for(j=1;j<=b;j++)
{
if(b%j==0)
d++;
}
if(d==2)
System.out.println("B is prime no:"+b);
else
System.out.println("B is not prime no:");

if(c==2 && d==2)
{
System.out.println("both no is prime");
}
else
{
System.out.println("both no is not prime then can't be both no is twin prime no");
}

System.out.println("checking for twin prime no:");
// if both no is prime then proceed for twin prime
if(a-b==2||b-a==2)
System.out.println("Twin prime");
else 
System.out.println(" not Twin prime");
}
}