import java.util.*;
class seriespcon
{
int i,j;
seriespcon(int l,int u)
{
Scanner s=new Scanner(System.in);
System.out.println("enter l and u:");
l=s.nextInt();
u=s.nextInt();
for(i=l;i<u;i++)
{
int c=0;
for(j=1;j<i;j++)
{
if(i%j==0)
c++;
}
if(c==1)
System.out.println(i+"\t");
}
}
public static void main(String ak[])   
{
int a,b;
seriespcon a1=new seriespcon(int ,int b);
}
}