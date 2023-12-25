class s
{
int x=10;
void show()
{
System.out.println("In a super class");
}
}

class d extends s
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