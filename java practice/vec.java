//wap in java to justify the statement "vector is any type any size dynamic generic array"

import java.util.*;
class vec
{
public static void main(String ak[])
{
int i;
Vector v=new Vector();
System.out.println(v.size());
v.add(12);
System.out.println(v.size());
v.add(12.34);
System.out.println(v.size());
v.add('$');
System.out.println(v.size());
v.add("vector");
System.out.println(v.size());
v.add("vector in java");
System.out.println(v);

//fetch  elements one by one from vector
for(i=0;i<v.size();i++)
{
System.out.print(v.elementAt(i)+"\t");
}
}
}