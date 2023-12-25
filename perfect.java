/* wap in java to ckeck a number is perfect or not */ 
import java.util.*;
class perfect
{
public static void main(String ar[])
{
int n,i,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("enter a no:");
n=s.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(n==sum)
System.out.print("Perfect no."+i);
else
System.out.println("Not a perfect no."+i);
}
}