import java.util.*;
class sumavg
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i,sum=0,avg=0;
System.out.println("Enter size of array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements :");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
sum=sum+a[i];
}
avg=sum/n;
System.out.println("Array elements are:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("Sum Of array Elements ="+sum);
System.out.println("Avg of array elements="+avg);

}
}