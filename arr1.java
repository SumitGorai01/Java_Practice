import java.util.*;
class arr1
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i;
System.out.println("Enter no of elements u want to store");
n=s.nextInt();
int a[]=new int[n];//dynamic array
for(i=0;i<a.length;i++)
a[i]=s.nextInt();
System.out.println("Array elements Are:\n");
for(i=0;i<a.length;i++)
System.out.print(a[i]+"\t");
}
}