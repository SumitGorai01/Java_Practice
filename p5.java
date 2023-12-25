/*wap in java to print the pattern like :
1
12
123
1234
12345  */

import java.util.*;
class p5
{
public static void main(String ak[])
{
int n,i,j;
System.out.println("Pattern is:");
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}