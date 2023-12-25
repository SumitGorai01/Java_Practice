class fibo100
{
public static void main(String ak[])
{
int a=0,b=1,c; 
System.out.println("fibonacci series less than 100:-");
System.out.print(a+"\t"+b+"\t");
while(true)
{
c=a+b;
if(c>=100)
{
break;
}
System.out.print(c+"\t");
a=b;
b=c;
}
}
}