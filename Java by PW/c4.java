import java.util.Scanner;
class c4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a No.:");
int num=sc.nextInt();
if(num>0)
{
System.out.println(num);
}
else{
System.out.println("The number is negative and skipped");
}
}
}