/* wap in java to print right pascal's triangle
   
       *
     * *
   * * *
 * * * * 
   * * *
     * *
       *

*/

class p19
{
public static void main(String ak[])
{
int i,j,k;
for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("  ");
}
for(k=i;k<=5;k++)
{
System.out.print("* ");
}
System.out.println();
}

for(i=1;i<4;i++)
{
for(k=3;k>=i;k--)
{
System.out.print("* ");
}
System.out.println();
}
}
}