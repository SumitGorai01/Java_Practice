import java.util.*;
class max
{
public static void main(String ar[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter no that u want find max and 2nd max on it:");
n=s.nextInt();
int a[]=new int[n];//dunamic array
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<a.length;i++)
{
System.out.println("data enter by user for finding max1 & max2 \t:"+a[i]);
}
int max1=0,max2=0;
for(i=0;i<a.length;i++)
{

if(a[i]>max1) 
{
max1=a[i];
}
}
System.out.println("1st max no="+max1);

for(i=0;i<a.length;i++)
{
if(a[i]==max1)
continue;
else
{
if(a[i]>max2)
{
max2=a[i];
}
}
}
System.out.println("2nd max no ="+max2);
}
}