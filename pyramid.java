//wap in java to print pyramide of asterik .   
import java.util.*;
class pyramid
{
public static void main(String ak[])
{
int n,i,j,k,a=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter no. till u want to print: ");
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(k=n;k>=i;k--)
{
System.out.print(" ");
}

for(j=1;j<=i;j++)
{
System.out.print(" *");
a++;
}
System.out.println();
}
}
}
