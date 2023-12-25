//Q.wap in java to check a no is prime or not?

class prime
{
public static void main(String x[])
{
int n=Integer.parseInt(x[0]);
int i,f=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
f++;
}
if(f==2)
System.out.println("Number is Prime.");
else
System.out.println("Number is not Prime.");
}
}