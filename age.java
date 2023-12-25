import java.util.*;
class age
{
public static void main(String ak[])
{
int num,mul,add,mul1,num1,add1,year,sub;
Scanner sc =new Scanner(System.in);
System.out.println("Choose a no. b/w 1 to 9:");
num=sc.nextInt();
mul=num*2;
add=mul+5;
mul1=add*50;
//System.out.println(mul1);
System.out.println("if your birthday is passed in this year\n"+"than Enter 1771 otherwise 1770");
System.out.println("Enter 1771 or 1770:");
num1=sc.nextInt();
add1=mul1+num1;
System.out.println("Enter your YEAR OF BIRTH:");
year=sc.nextInt();
sub=add1-year;
System.out.println(sub+"\nFirst digit is your number you choose in first time"+"\nLast 2 digit is your AGE");
}
}