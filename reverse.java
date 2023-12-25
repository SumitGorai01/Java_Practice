import java.util.*;
class reverse
{
public static void main(String j[])
{
int n,rem,i,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a no:");
n=s.nextInt();
for(i=n;i>0;i=i/10)
{
sum=sum*10+(i%10);
}
System.out.println("reverse of no :"+sum);
}
}