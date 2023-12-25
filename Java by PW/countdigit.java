import java.util.*;
class countdigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.:");
int n=sc.nextInt();
int count=0;
while(n>0){
count++;
n=n/10;
}
System.out.println("No. of digit="+count);
}
}