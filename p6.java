/* wap in java to print pyramide of asterik . 
        *
       * *
      * * *
     * * * *   

*/  
import java.util.*;
class p6
{
public static void main(String ak[])
{
int n=5,i,j,k;

for(i=1;i<=n;i++)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}
