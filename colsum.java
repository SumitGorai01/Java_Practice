/*wap in java to store 3x3 numbers in two dimensional array and
 find sum of each column.*/
import java.util.*;
class colsum
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int i,j,cs=0,k=0;
int a[][]=new int[3][3];//dynamic array
int x[]=new int[3];
System.out.println("Enter 9 elements of your matrix :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("matrix elements Are:\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
cs=cs+a[j][i];
System.out.print(a[i][j]+"\t");
}
x[k]=cs;
k++;
cs=0;
System.out.println();
}
System.out.println("-------------------------");
for(i=0;i<k;i++)
System.out.print(x[i]+"\t");
}
}
