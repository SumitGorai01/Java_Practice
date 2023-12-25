import java.util.*;
class bintodec{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.:");
int n=sc.nextInt();
int dec=0;
int pow=1;
while(n>0){
dec=dec+n%2*pow;
pow=pow*2;
n=n/10;
}
System.out.println(dec);
}
}