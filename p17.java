/* wap in java to print left downward triangle using astrik

  * * * * *
    * * * *
      * * *
        * *
          *
*/

class p17
{
public static void main(String ak[])
{
int i,j,k;

for(i=1;i<=5;i++)
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
}
}