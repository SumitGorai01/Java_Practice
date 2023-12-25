import java.util.*;
class conditional
{
public static void main(String ak[])
{
Scanner sc= new Scanner(System.in);
int a,b,c,max=0;
System.out.println("Enter three no.:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
max=a>b&&b>c?a:b>c?b:c;
System.out.println("Greatest no.="+max);
}
}
