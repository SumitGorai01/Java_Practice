import java.util.*;
class arraysum
{
public static void main(String aj[])
{
int n,i;
double sum=0,avg=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no in array=");
n=s.nextInt();
 int a[]= new int[n];
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
sum=sum+a[i];
}
System.out.println("arraysum="+sum);
avg=(avg+(sum/a.length));
System.out.println("average of array="+avg);
}
}