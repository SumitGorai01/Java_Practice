/*wap in java to print the pattern like :
     1
    2 3
   4 5 6
  7 8 9 10*/

import java.util.*;
class p3
{
public static void main(String ak[])
{
int n,i,j,k,a=1;
System.out.println("Pattern is:");
for(i=1;i<=4;i++)
{
for(j=4;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(a+" ");
a++;
}
System.out.println();
}
}
}