import java.util.*;
class nemployee
{
String name,dept;
int id;
double sal;
static Scanner s=new Scanner(System.in);
void get_data()
{
System.out.println("Enter name id dept and salary");
name=s.next();
id=s.nextInt();
dept=s.next();
sal=s.nextDouble();
}
void display()
{
System.out.println(name+"\t"+id+"\t"+dept+"\t"+sal+"\n");
}
public static void main(String ak[])
{
int i;
System.out.println("Enter no of emplyees u have");
int n=s.nextInt();
employee obj[]=new employee[n];
for(i=0;i<n;i++)
{
obj[i]=new employee();
obj[i].get_data();
}
for(i=0;i<n;i++)
{
obj[i].display();
}
}
}