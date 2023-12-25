/*9.Write a program to create a ―distance‖ class with methods where
 distance is computed in terms of feet and inches, how to create objects 
of a class and to see the use of this pointer*/

class distance
{
int feet;
double inch;
void input(int feet, double inch)
{
this.feet=feet;
this.inch=inch;
System.out.println("before conversion -->\n"+feet+"feet "+inch+"inch");
}
void output(int length)
{
feet=(int)(length/(12*2.54));
inch=((length-feet*12*2.54)/2.54);
System.out.println("After conversion -->");
System.out.println(length+"c.m= "+feet+"feet "+inch+"inch");
}
}
public class Q9
{
public static void main(String ak[])
{
distance obj=new distance();
obj.input(5,7.0);
obj.output(70);

}
}