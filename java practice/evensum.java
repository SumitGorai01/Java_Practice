import java.util.*;
class evensum
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i,evensum=0;
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
for(i=0;i<a.length;i++)
{
if(a[i]%2==0)
evensum=evensum+a[i];
}

System.out.println("Sum Of array Elements ="+evensum);


}
}