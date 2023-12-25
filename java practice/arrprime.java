import java.util.*;
class arrprime
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i,f=0,j;
System.out.println("Enter size of array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements :");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}

System.out.println("Array elements are:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}


//prime logic 
System.out.println("Prime inside the array ");
for(i=0;i<a.length;i++)
{
f=0;
for(j=1;j<=a[i];j++)
{

if(a[i]%j==0)
f++;
}
if(f==2)
System.out.println(a[i]);
}

}
}