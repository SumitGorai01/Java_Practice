import java.util.*;
class m4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a year:");
int year=sc.nextInt();
leap(year);
}
public static void leap(int year){
if(year%4==0 || year%100!=0 || year%400==0){
System.out.println("True");
}
else{
System.out.println("False");
}
}
}