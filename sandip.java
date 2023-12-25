import java.util.*;
class sandip
{
int a,b,sum;
/*Scanner s=new Scanner(System.in);*/
void get_data()
{
System.out.println("Enter a & b");
a=s.nextInt();
b=s.nextInt();
}
void cal()
{
sum=a+b;
}
void display()
{
System.out.println("sum="+sum);
}
public static void main (String ak[])
{
int a,b,sum;
Scanner s=new Scanner(System.in);
sandip ar=new sandip();
ar.get_data();
ar.cal();
ar.display();
}
}