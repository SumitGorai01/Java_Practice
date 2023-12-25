import java.util.Scanner;
class si{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principle :");
double p=sc.nextInt();
System.out.println("Enter Rate:");
double r=sc.nextInt();
System.out.println("Enter Time:");
double t=sc.nextInt();
double si=(p*r*t)/100;
System.out.println("Simple Interest="+si);
}
}