/*10.Modify the ―distance‖ class by creating constructor for assigning values
(feet and inches) to the distance object. Create another object and assign 
second object as reference variable to another object reference variable. 
Further create a third object which is a clone of the first object.*/

class distance
{
int feet, inch;
distance(int f,int i)
{
feet=f;
inch=i;
System.out.println("Parameterized Constructor");
}
void disp()
{
System.out.println("Feet: "+feet);
System.out.println("Inch: "+inch);
}
distance(distance obj)
{
feet=obj.feet;
inch=obj.inch;
System.out.println("Clone or Copy Constructor");
}
}
class Q10
{
public static void main(String args[])
{
distance obj1=new distance(3,5);
obj1.disp();
distance obj2=new distance(obj1);

obj2.disp();
}
}