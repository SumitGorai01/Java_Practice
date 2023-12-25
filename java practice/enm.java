//enumeration in java

import java.util.*;
class enm
{
public static void main(String ak[])
{
Vector v=new Vector();
v.add(12);
v.add(12.34);
v.add('$');
v.add("vector");
Enumeration e=v.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());
}
}
}