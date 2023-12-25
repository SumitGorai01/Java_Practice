import java.util.*;
class primecon
{
primecon(int l1,int u1)
{
int l=obj.l1;
int u=obj.u1;
int i,j,f=0;
for(i=l;i<=u;i++)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
f++;
}
if(f==1)
System.out.println("Prime no."+i);
}
}
public static void main(String ak[])
{
int l1,u1;
Scanner s =new Scanner(System.in);
System.out.println("Enter a lower range:");
l1=s.nextInt();
System.out.println("Enter a upper range:");
u1=s.nextInt();
primecon obj=new primecon(l1,u1);//call the parametrized constructor
}
}
