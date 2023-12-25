import java.util.*;
class mul
{
public static void main(String aj[])
{
int i,j,r,c,r1,c1,k,d=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter row and columnn for matrix A:");
r=s.nextInt();
c=s.nextInt();
System.out.println("Enter matrix element in matrix A:");
int a[][]=new int[r][c];//dynamic array
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println(" matrix A is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

System.out.println("Enter the row and colum for matrix B:");
Scanner s1=new Scanner(System.in);
r1=s1.nextInt();
c1=s1.nextInt();
int b[][]=new int[r1][c1];//dynamic array
System.out.println("Enter matrix element in matrix B:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("matrix B is :");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
if(c==r1)
{
System.out.println("multipilication of both matrix A & B are :");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
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
else
System.out.println("multiplication does not exist");

}
}
