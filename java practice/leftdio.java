//wap in java to display left diogonal of matrix

import java.util.*;
class leftdio
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Left diagonal Elements are:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i==j)
System.out.print(a[i][j]+"\t");
else
System.out.print("\t");
}
System.out.println("\n");
}
}
}