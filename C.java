/*
Implement multiple inh where all the super classes are 
interface?
*/


//import java.util.*;
interface A
{
void area();//by default abstract method
}
interface B
{
int l=4;
int b=5;//by default final data
}
class C implements B,A
{
public void area()
{
System.out.println("Area="+(l*b));
}
public static void main(String ak[])
{
C obj=new C();
//obj.getl();
obj.area();
}
}