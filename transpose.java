import java.util.*;
class transpose
{ 
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
int i,j,r,c;
System.out.println("Enter rows and col:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];//dynamic array
int transpose[][]=new int[r][c];

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.println("matrix elements Are:\n");

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
transpose[j][i]=a[i][j];
}
}

System.out.println("The transpose of the matrix is:\n");

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
System.out.print(transpose[i][j]+"\t");
}
System.out.println();
}
}
}
