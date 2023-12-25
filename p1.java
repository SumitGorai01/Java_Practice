/*wap in java to print the pattern :
1
22
333
4444
55555*/

import java.util.*;
class p1
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,a=1,i,j;
System.out.println("Enter no. that how many line u want to print pattern:");
n=s.nextInt();
System.out.println("Pattern is:");
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(a);
}
a++;
System.out.println();
}
}
}