/* wap in java to print pyramide of asterik . 
          1
      1  2  1
  1  2  3  2  1  

*/  
import java.util.*;
class p20
{
public static void main(String ak[])
{
int n=3,i,j,k,l;

for(i=1;i<=n;i++)
{
for(j=1;j<=4-i;j++)
{
System.out.print("   ");
}
for(k=1;k<=i;k++)
{
System.out.print(k+"  ");
}
for(l=i-1;l>0;l--)
{
System.out.print(l+"  ");
}
System.out.println();
}
}
}
