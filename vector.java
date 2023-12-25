import java.util.*;
class vector
{
public static void main(String ak[])
{
Vector v=new Vector();
System.out.println(v.size());
v.add(12);
System.out.println(v.size());
v.add(13.342);
System.out.println(v.size());
v.add('$');
System.out.println(v.size());
v.add("java");
System.out.println(v.size());
v.add("java is oops");
System.out.println(v.size());	
System.out.println(v);
}
}