//wap in java to add two matrix 

import java.util.*;
class addmatrix
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];

System.out.println("Enter Elements of first matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("firstr Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}

System.out.println("Enter Elements of second matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}

System.out.println("Second Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Sum  of matrix is :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+b[i][j]+"\t");
}
System.out.println("\n");
}
}
}