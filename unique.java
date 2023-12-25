//unique no doubt in this question
import java.util.*;
class unique
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,d,f=0;
System.out.println("Enter a no.:");
n=sc.nextInt();
for(i=n;i>0;i=i/10)
{
d=0;
for(j=n;j>0;j=j/10)
{
if(i%10==j%10)
d++;
}
if(d>1)
{
System.out.println("Not a Unique No.");
f++;
break;
}
}
if(f==0)
System.out.println("Not a Unique No.");
}
}
