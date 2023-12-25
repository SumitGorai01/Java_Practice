
import java.util.*;
class ar
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int r,c,i,j;
System.out.println("Enter no of rows and col");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];//dynamic array
int b[][]=new int[r][c];
System.out.println("enter element of first matrix");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("enter element of second matrix");
for(i=0;i<b.length;i++)
{
for(j=0;j<b[i].length;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println(" elements of first Are:\n");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("element of second matrix");
for(i=0;i<b.length;i++)
{
for(j=0;j<b[i].length;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
}
}
