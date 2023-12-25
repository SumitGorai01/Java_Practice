import java.util.*;
class max
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i,max1=0,max2=0,j;
System.out.println("Enter size of array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter array Elements:");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println("Array Elements are:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

for(i=0;i<a.length;i++)
{
if(a[i]>max1)
{
max1=a[i];
}
}
System.out.println("1st Max elements:"+max1);

for(i=0;i<a.length;i++)
{
if(a[i]==max1)
{
continue;
}
else
{
if(a[i]>max2)
{
max2=a[i];
}
}
}
System.out.println("2nd Max Elements:"+max2);
}
}