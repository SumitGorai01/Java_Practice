//wap in java to print the next prime
import java.util.*;
class nextprime
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,f;
System.out.println("Enter no");
n=sc.nextInt();
for(i=n+1;;i++)
{
f=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
f++;
}
if(f==2)
{
System.out.println("Next Prime No. ="+i);
break;
}
}
}
}