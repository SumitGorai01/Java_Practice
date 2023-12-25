//Q.wap in java to check a no is paildrom or not?
import java.util.*;
class pailindrome
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a no:");
int num=s.nextInt();
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