//iteration in java

import java.util.*;
class ite
{
public static void main(String ak[])
{
Vector v=new Vector();
v.add(12);
v.add(12.34);
v.add('$');
v.add("vector"); 
Iterator i=v.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}