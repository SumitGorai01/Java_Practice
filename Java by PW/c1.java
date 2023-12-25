import java.util.Scanner;
class c1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Iength:");
int l=sc.nextInt();
System.out.println("Enter breadth:");
int b=sc.nextInt();
if(l==b)
{
System.out.println("It is square");
}
else{
System.out.println("It is rectangle");
}
}
}