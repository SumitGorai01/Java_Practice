interface A
{
void area();
}
interface B
{
int l=4;
int b=5;
}
class D implements B ,A
{
public void area()
{
System.out.println("Area="+(l*b));
}
public static void main(String ak[])
{
D obj=new D();
obj.area();
}
}
