//wap in java to chech whether a matrix is unit or not?

import java.util.*;
class unit 
{
public static void main(String ak[])
{
int r,c,i,j,k=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter Elements of first matrix:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println(" Matrixs is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]!=1 && a[j][i]!=0)
{
k++;
break;
}
}
}
if(k==0)
System.out.println("Unit matrix");
else
System.out.println("Not a Unit Matrix");
}
}