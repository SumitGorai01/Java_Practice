/*wap in java to print the pattern like :
1
23
456
78910  */

import java.util.*;
class p4
{
public static void main(String ak[])
{
int n,i,j,k,a=1;
System.out.println("Pattern is:");
for(i=1;i<=4;i++)
{
for(k=1;k<=i;k++)
{
System.out.print(a);
}
System.out.println();
}
a++;
}
}