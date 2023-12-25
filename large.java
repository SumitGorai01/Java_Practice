//wap in java to store 10 no.in one dimensional array and find largest among them.
import java.util.*;
class large
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int i;
int a[]=new int[10];
System.out.println("Enter 10 no:");
for(i=0;i<10;i++)
{
a[i]=s.nextInt();
}
int l=a[0];
for(i=0;i<10;i++)
{
if(l<a[i])
l=a[i];
}
System.out.println("largest no.="+l);
}
}