/*6.To check if a number is prime or not, by taking the number as input 
from the keyboard */

import java.util.*;
class Q6
{
public static void main(String args[])
{
int i,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.to check prime or not :");
int num=sc.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
f++;
}
if(f==2)
System.out.println("Prime no.");
else
System.out.println("Not a prime no.");
}
}