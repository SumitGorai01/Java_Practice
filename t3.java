class t1 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread1="+i);
}
}
class t2 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread2="+i);
}
}
class t3 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread3="+i);
}
public static void main(String ak[])
{
t1 obj1=new t1();
t2 obj2=new t2();
t3 obj3=new t3();
obj1.start();
obj2.start();
obj3.start();
}
}