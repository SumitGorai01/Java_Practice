/*wap in java to prime no between 1 to 100?*/
class sp
{
public static void main(String aj[])
{
int i,j,f=0;
for(i=1;i<=100;i++)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
f++;
}
if(f==2)
System.out.println("Series of prime no:" +i);
f=0;
}
}
}
