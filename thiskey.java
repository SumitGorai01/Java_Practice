class thiskey
{
int x,y;
void get(int x,int y)
{
this.x=x;
this.y=y;
}
void add()
{
System.out.println("sum="+(x+y));
}
public static void main(String ak[])
{
thiskey obj=new thiskey();
obj.get(1,2);
obj.add();
}
}