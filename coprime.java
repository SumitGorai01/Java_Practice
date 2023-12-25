/* wap in java to ckeck co-prime number*/ 

import java.util.*;
class coprime
{
public static void main(String j[])
{
int a,b,d,i,f=0;
Scanner s=new Scanner (System.in);
System.out.println("Enter two no:");
a=s.nextInt(); 
b=s.nextInt();
d=a<b?a:b;
for(i=1;i<=d;i++)
{
if(a%i==0 && b%i==0)
f++;
}
if(f==1)
System.out.println(" Co-prime");
else
System.out.println(" Not Co-prime");
}
}