/*3.To learn use of single dimensional array by defining the array
dynamically.*/

import java.util.*;
class Q3
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int n,i;
System.out.println("Enter no. of elements u wamt to store in single dimensional array: ");
n=s.nextInt();
System.out.println("Enter elements :");
int a[]=new int[n];//dynamic array
for(i=0;i<a.length;i++)
a[i]=s.nextInt();
System.out.println("Array elements Are:\n");
for(i=0;i<a.length;i++)
System.out.print(a[i]+"\t");
}
}