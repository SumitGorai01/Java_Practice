/*8.Write a program ―Divide By Zero‖ that takes two numbers a and b as input,
computes a/b, and invokes Arithmetic Exception to generate a message when 
the denominator is zero.*/


import java.util.Scanner;
class DivideByZero
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two no.:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(a/b);
}
catch(ArithmeticException e)
{
System.out.println("Arithmatic Exception occures");
}
}
}