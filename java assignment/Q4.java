//4.To learn use of length in case of a two dimensional array

import java.util.*;
class Q4
{ 
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r,c,i,j;
System.out.println("Enter no. of rows and col");
r=s.nextInt();
c=s.nextInt();
System.out.println("Enter elements :");
int a[][]=new int[r][c];
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrix elements Are:\n");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}
