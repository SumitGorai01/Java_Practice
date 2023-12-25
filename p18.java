/* wap in java to print left pascal's triangle
   
  *
  * *
  * * *
  * * * *
  * * *
  * *
  *

*/

class p18
{
public static void main(String ak[])
{
int i,j,k;
for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}

for(i=1;i<4;i++)
{
for(k=i;k<4;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}