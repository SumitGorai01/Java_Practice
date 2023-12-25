import java.util.*;
class sort
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i,t,j;
System.out.println("Enter how many no. u want to sort :");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter Elements:");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println("Your elements are:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]+"\t");
}
System.out.println("Sort Array is:");
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
System.out.println(a[i]);
}

}
}