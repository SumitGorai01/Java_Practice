import java.util.*;
class rightdio
{
public static void main(String ak[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter rows and cols:");
r=s.nextInt();
c=s.nextInt();
int a[][]=new int[r][c];
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("Matrixs is:");
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println("\n");
}
System.out.println("Right diagonal Elements are:");
int x=r-1;
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
if(j==x)
System.out.print(a[i][j]+"\t");
else
System.out.print("\t");
}
x--;
System.out.println("\n");
}
}
}