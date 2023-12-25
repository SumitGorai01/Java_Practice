import java.util.*;
class addition10{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter decimal no.:");
int d=sc.nextInt();

System.out.println("Enter binary no.:");
int b=sc.nextInt();

int dec=0;
int pow=1;
while(b>0){
dec=dec+b%2*pow;
pow=pow*2;
b=b/10;
}
System.out.println(d+dec);
}
}