//wap in java to justify the statement "ArrayList is any type any size dynamic generic array"

import java.util.*;
class arlist
{
public static void main(String ak[])
{
int i;
ArrayList a=new ArrayList();
System.out.println(a.size());
a.add(12);
System.out.println(a.size());
a.add(12.34);
System.out.println(a.size());
a.add('$');
System.out.println(a.size());
a.add("vector");
System.out.println(a.size());
a.add("vector in java");
System.out.println(a);

}
}

