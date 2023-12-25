import java.util.*;
class op2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Two No.:");
int x=sc.nextInt();
int y=sc.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println(x);
System.out.println(y);
}
}