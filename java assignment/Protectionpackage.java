/*Write a program that creates illustrates different levels of protection 
in classes/subclasses belonging to same package or different packages.*/


package protection;
public class Protection
{
private int x = 2; //Can Only be used inside this class. 
                   //Use getters to use this private member outside the class
public int y = 30; //Can be used outside the class
protected int z = 10; //Can be used by subclasses.
                     //For example the subclass adidas below
int getX()
{
return x;
}
public static void main(String[] args) 
{
adidas ad = new adidas();
ad.display();
}
}
class adidas extends Protection
{
public void display()
{
System.out.println("The value of x is\t "+getX());
System.out.println("The value of y is\t "+y); //Showing how the public member variable y is accessed in the class
System.out.println("The value of z is\t "+z); //Showing how the protected member variable x is accessed in the class
}
}