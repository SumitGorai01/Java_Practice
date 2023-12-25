/*wap in java to store 3x3 numbers in two dimensional array and
 find sum of each row.*/
import java.util.*;
class rowsum
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int i,j,r=3,c=3,rs=0;
int a[][]=new int[r][c];//dynamic array
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
rs=rs+a[i][j];
System.out.print(a[i][j]+"\t");
}
System.out.println("=  "   +rs);
rs=0;
System.out.println();
}
}
}
