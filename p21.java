/* 
          1
        1  2
      1  2  3
    1  2  3  4
  1  2  3  4  5
*/

class p21
{
public static void main(String ak[])
{
int i,j,p,k,l,a;
for(i=1;i<=5;i++)
{
p=1;
for(j=i;j<=8;j++)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(" "+ p++);
}
System.out.println();
}
}
}


