import java.util.*;

class m1{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three no.:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("Avg="+avg(a,b,c));
}
public static int avg(int a,int b,int c){
return (a+b+c)/3;
}

}

