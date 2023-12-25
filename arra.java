import java.util.*;
class arra
{
public static void main(String aj[])
{
int n,i,evensum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("Enter no");
int a[]=new int[n];//dynamic array
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();

if(i%2==0)
evensum=evensum+a[i];
}
System.out.println("sum of even element of array="+evensum);
}
}