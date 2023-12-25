import java.util.*;
class dectobin{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.:");
int n=sc.nextInt();
int bin=0;
int pow=1;
while(n>0){
bin=bin+n%2*pow;
pow=pow*10;
n=n/2;
}
System.out.println(bin);
}
}