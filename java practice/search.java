import java.util.*;
class search
{
public static void main(String ak[])
{
int n,i,key,f=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter array Elements:");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println("Array elements are:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter Elements to search:");
key=s.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
System.out.println("Data Found ");
f++;
break;
}
}
if(f==0)
System.out.println("Data Not Found");
}
}