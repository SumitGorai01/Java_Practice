import java.util.*;
class sumofnatural{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many term u want to add:");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Sum of natural no.="+sum);
}
}