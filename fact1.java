//Q.wap in java to find the fact  of a given no?

import java.util.*;
class fact1
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a no. to find factorial:");
int n=s.nextInt();
int f=1;
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out .println("factorial="+f);
}
}
