//wap in java to multiply two square matrix

import java.util.*;
class mulmatrix
{
public static void main(String aj[])
{
int i,j,r,c,k,d=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter row and columnn:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];//dynamic array
int b[][]=new int[r][c];//dynamic array
System.out.println("Enter element of matrix A  :");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("matrix's element of matrix A are :");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

System.out.println("Enter elements of  matrix B:");

for(i=0;i<b.length;i++)
{
for(j=0;j<b.length;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("matrix's element of matrix B are :");
for(i=0;i<b.length;i++)
{
for(j=0;j<b.length;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
System.out.println("multipilication of both matrix A & B are :");
for(i=0;i<b.length;i++)
{
for(j=0;j<b.length;j++)
{
d=0;
for(k=0;k<a.length;k++)
{
d=d+a[i][k]*b[k][j];
}
System.out.print(d+"\t");
}
System.out.println();
}
}
}