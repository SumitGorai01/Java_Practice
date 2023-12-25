import java.util.*;
class arrayprime2 
{
public static void main(String args[])
{
int i,n,j,c;
Scanner s= new Scanner(System.in);
System.out.print("Enter size of array:");
n=s.nextInt();
int a[]= new int[n];
System.out.println("Enter elements in your array:");
for(i=0;i<n;i++) 
{
a[i]=s.nextInt();
}
System.out.print("Prime numbers in your array are:");
for(i=0;i<n;i++) 
{
c=1;
for(j=2;j<a[i];j++) 
{
if(a[i]%j==0)
{
c=0;
break;
}
}
if(c==1) 
{
System.out.print(" " +a[i]);
}
}
}
}