import java.util.*;
class sumdigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.:");
int n=sc.nextInt();
int sum=0;
while(n>0){
sum=sum+(n%10);
n=n/10;
}
System.out.println("Sum of digit="+sum);
}
}