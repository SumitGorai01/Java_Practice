import java.util.*;
class twistedprime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.:");
int n=sc.nextInt();
int f=0 ,i;
//Checking the no. is prime or not
for(i=1;i<=n;i++)
{
if(n%i==0)
f++;
}
if(f==2)
System.out.println("Prime No.");
else
System.out.println("Not a Prime No.");

//reverse the no.
int rev=0;
for(i=n;i>0;i=i/10)
{
rev=rev*10+(n%10);
}
System.out.println("Reverse No.="+rev);

}
}