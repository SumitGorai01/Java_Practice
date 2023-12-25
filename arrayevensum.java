import java.util.*;
class arrayevensum
{
public static void main(String aj[])
{
int n,i,evensum=0,oddsum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of array:");
n=s.nextInt();
int a[]=new int[n];//dynamic array
System.out.println("Enter array elenents:");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<a.length;i++)
{
if(a[i]%2==0)
evensum=evensum+a[i];
continue;
}
/*else
{
oddsum=oddsum+a[i];
}*/
//System.out.println("sum of odd element of array="+oddsum);
System.out.println("sum of even element of array="+evensum);
}
}