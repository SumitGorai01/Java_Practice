import java.util.*;
class revdigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.:");
int n=sc.nextInt();
int rev=0;
while(n>0){
rev=rev*10+n%10;
n=n/10;
}
System.out.println("Reverse of digit="+rev);
}
}