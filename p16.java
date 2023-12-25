/* wap in java to print sandglass shape using asterik . 
      
      * * * *
       * * * 
        * *
         *
        * *
       * * *   
      * * * *
*/  

class p16
{
public static void main(String ak[])
{
int i,j,k;

for(i=1;i<=4;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" ");
}
for(k=4;k>=i;k--)
{
System.out.print(" *");
}
System.out.println();
}

for(i=1;i<4;i++)
{
for(j=4;j>i;j--)
{
System.out.print(" ");
}
for(k=0;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
