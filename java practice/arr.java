import java.util.*;
class arr
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i;
System.out.println("Enter how many no. u want to store:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter Elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Elements Are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]+"\t");
}
}
}