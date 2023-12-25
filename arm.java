//Q.wap in java to check a three digit no is armstrong or not?

class arm
{
public static void main(String x[])
{
int num=Integer.parseInt(x[0]);
int temp,sum=0,r;
temp=num;
while(num>0)
{
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
if(temp==sum)
System.out.println("Armstrong number. ");
else
System.out.println("Not Armstrong number.");
}
}