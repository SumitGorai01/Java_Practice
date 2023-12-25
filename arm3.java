//Q.wap in java to check a three digit no is armstrong or not?
import java.util.*;
class arm3
{
public static void main(String x[])
{
int num,temp,sum=0,r;
Scanner s=new Scanner(System.in);
System.out.print("Enter no. u want to check:");
num=s.nextInt();

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