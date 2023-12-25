import java.util.*;
class 2d
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
System.out.print(a[i][j]);
}
System.out.println("\n");
}

}
}