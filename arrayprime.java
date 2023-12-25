//Q.wap in java to display the prime inside an array.
import java.util.*;
class arrayprime
{
public static void main(String x[])
{
int n,j,i,f;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array");
n=s.nextInt();
int a[]=new int[n];
System.out.println("array elements are:");
for(j=0;j<a.length;j++)
{
a[j]=s.nextInt();
}
System.out.println("Prime no in array");

for(j=0;j<a.length;j++)
{
f=0;
for(i=1;i<=a[j];i++)
{
if(a[j]%i==0)
f++;
}
if(f==2)
System.out.println(a[j]);

}
}
}