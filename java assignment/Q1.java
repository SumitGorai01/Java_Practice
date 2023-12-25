//1.To find the sum of any number of integers entered as command line arguments

class Q1
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int Sum=a+b;
System.out.println("Sum of "+a+" and "+b+" is "+Sum);
}
}