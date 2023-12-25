/*wap in java to print the pattern :
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5*/

import java.util.*;
class p2
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,a=1,i,j,k;
System.out.println("Enter no. that how many line u want to print pattern:");
n=s.nextInt();
System.out.println("Pattern is:");
for(i=1;i<=n;i++)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(a+ " ");
}
a++;
System.out.println();
}
}
}