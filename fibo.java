//wap in java to print fibonacci series.

import java.util.*;
class fibo
{
public static void main(String ag[])
{
int n,a=-1,b=1,c,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter no. till u want to print fibonacci series :");
n=s.nextInt();
System.out.println("Fibonacci series till " +n+ " terms");
//System.out.println("\t"+a);
//System.out.println("\t"+b);
for(i=1;i<=n-2;i++)
{
c=a+b;
System.out.println("\t"+c);
a=b;
b=c;
}   
}
}