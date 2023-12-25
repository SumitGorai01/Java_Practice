/* wap in java 
1+2+3+...........+n
*/
import java.util.*;
class sumofn
{
public static void main(String ak[])
{
int n,i,sum=0;
Scanner s=new Scanner (System.in);
System.out.println("Enter a no till that no u want to sum:");
n=s.nextInt();

for(i=1;i<=n;i++)
{
sum=sum+i;
System.out.println("sum of natural no:"+sum);
}
}
}
