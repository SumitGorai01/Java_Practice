//Q.wap in java to check a no is paildrom or not?

class p
{
public static void main(String x[])
{
int num=Integer.parseInt(x[0]);
int temp,sum=0,r;
temp=num;
while(num>0)
{
r=num%10;
sum=(sum*10)+r;
num=num/10;
}
if(temp==sum)
System.out.println("Palindrome number. ");
else
System.out.println("Not palindrome number.");
}
}