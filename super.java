class super
{
int x=10;
void show()
{
System.out.println("In a sub class");
}
}
class d extends super
{
void show()
{
super.show();
System.out.println("In sub class="+x);
}
public static void main(String aj[])
{
d obj=new d();
obj.show();
}
}