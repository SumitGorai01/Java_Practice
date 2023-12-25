/*11.Write a program to show that during function overloading, if no matching 
argument is found, then java will apply automatic type conversions(from 
lower to higher data type)*/

class funover
{
void get_data(int i)
{
System.out.println("Integer is :"+i);
}
void get_data(float f)
{
System.out.println("Float is :"+f);
}
void get_data(double d)
{
System.out.println("Double is :"+d);
}
}
class Q11
{
public static void main(String args[])
{
int i=56;
float f=56.3f;
double d=55.632;

funover obj=new funover();
obj.get_data(i);
obj.get_data(f);
obj.get_data(d);
}
}