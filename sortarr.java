//wap in java to store 10 no. in one dimensional array and find sort them.
import java.util.*;
class sortarr
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int i,j,t;
int a[]=new int[10];
System.out.println("Enter 10 no.:");
for(i=0;i<10;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Sorting of array elements: ");
for(i=0;i<10;i++)
System.out.println(a[i]+"\t");
}
}