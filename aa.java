import java.util.*;
class Sum
{
int a,b,c;
void input()
{
Scanner s=new Scanner(System.in);
System.out.println("enter two no.");
a=s.nextInt();
b=s.nextInt();
}
void cal()
{
c=a+b;
}
void disp()
{
System.out.println("sum="+c);
}
}
public class aa
{ 
public static void main(String ak[])
{
/*Scanner s=new Scanner(System.in);
System.out.println("enter two no.");
a=s.nextInt();
b=s.nextInt();*/
Sum obj=new Sum();
obj.input();
obj.cal();
obj.disp();
}
}
