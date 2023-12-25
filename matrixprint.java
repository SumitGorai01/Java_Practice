import java.util.*;
class matrixprint
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int i,j,r,c;
System.out.println("Enter rows and col:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];//dynamic array
System.out.println("Enter rmatrix elements:");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("matrix elements Are:\n");

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
