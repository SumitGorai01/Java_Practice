//wap in java to store 'n' elements in one dimensional array and find largest among them.
import java.util.*;
class large1
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter how many no you want to print:");
int n=s.nextInt();
int i;
int a[]=new int[n];
System.out.println("Enter " + n + " elements in your array:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int l=a[0];
for(i=0;i<n;i++)
{
if(l<a[i])
l=a[i];
}
System.out.println("largest no.="+l);
}
}