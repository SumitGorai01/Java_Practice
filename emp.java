import java.util.*;
class emp
{
int id;
String name;
double sal;
String dept;
emp(int i,double s,String n,String d)
{
id=i;
sal=s;
name=n;
dept=d;
}
void display()
{
System.out.println(name+"\t"+dept+"\t"+id+"\t"+sal+"\n");
}
public static void main(String ak[])
{
List<emp> v=new Vector();
int n,j,ch;
Scanner s=new Scanner(System.in);
do
{
System.out.println("1.Insert");
System.out.println("2.Display");
System.out.println("3.Search");
System.out.println("4.Delete");
System.out.println("5.update");
System.out.println("Enter your choice:");
ch =s.nextInt();

switch(ch)
{
case 1:
System.out.println("Enter  id sal  name and dept");
emp obj=new emp(s.nextInt(),s.nextDouble(),s.next(),s.next());
v.add(obj);
break;

case 2:
System.out.println("-----------------------------");
Iterator i=v.iterator();
while(i.hasNext())
{
emp ob=(emp)(i.next());
ob.display();
}
System.out.println("-----------------------------");
break;

case 3:
boolean found=false;
System.out.println("Enter id to search:");
int key=s.nextInt();
System.out.println("-----------------------------");
i=v.iterator();
while(i.hasNext())
{
emp ob=(emp)(i.next());
if(ob.id==key)
{
System.out.println(ob);
found=true;
}
}
if(!found)
{
System.out.println("id not found");
}
System.out.println("-----------------------------");
break;

case 4:
found=false;
System.out.println("Enter id to delete:");
key=s.nextInt();
System.out.println("-----------------------------");
i=v.iterator();
while(i.hasNext())
{
emp ob=(emp)(i.next());
if(ob.id==key)
{
i.remove();
found=true;
}
}
if(!found)
{
System.out.println("id not found");
}
else
{
System.out.println("id deleted ");
}
System.out.println("-----------------------------");
break;

case 5:
found=false;
System.out.println("Enter id to update:");
key=s.nextInt();
System.out.println("-----------------------------");
ListIterator<emp>li=v.listIterator();
while(li.hasNext())
{
emp ob=(emp)(li.next());
if(ob.id==key)
{
System.out.println("Enter new sal name and dept ");
double sal=s.nextDouble();
String name=s.next();
String dept=s.next();
li.set(new emp(key,sal,name,dept));
found=true;
}
}
if(!found)
{
System.out.println("id not found");
}
else
{
System.out.println("id updated  ");
}
System.out.println("-----------------------------");
break;
}
}
while(ch!=0);
}
}