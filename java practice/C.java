import java.util.*;
class A{
Scanner s=new Scanner(System.in);
int l;
void getl()
{
System.out.println("Enter value of l:");
l=s.nextInt();
}
}
interface  B 
{
int b=4;
void area();
}
class C extends A implements B
{
public void area()
{
System.out.println("area ="+(l*b));
}
public static void main(String ak[])
{
C obj=new C();
obj.getl();
obj.area();
}
}