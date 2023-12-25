import java.util.*;
class linear
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n,i,key=0;
System.out.println("Enter how many data u want to store:");
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter key element to be search in data:");
key=s.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
System.out.println("data found at position in array:"+(i+1));
break;
}
}
if(i==a.length)
System.out.println("Data not  found in array:");
}
}