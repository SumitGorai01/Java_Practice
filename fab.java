import java.util.*;
class rev
{
int r,n,sum=0;
Scanner sc=new Scanner(System.in);
rev()
{
System.out.println("Enter a no");
n=sc.nextInt();
}
rev(rev ref)
{
int num=ref.n;
while(num>0)
{
r=num%10;
sum=sum*10+r;
num=num/10;
}
System.out.println("Reverse no="+sum);
}
};
class fab
{
public static void main(String args[])
{
rev obj=new rev();
rev obj1=new rev(obj);
}
}

