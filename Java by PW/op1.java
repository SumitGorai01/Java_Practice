import java.util.Scanner;
class op1{
public static void main(String args[]){
int x;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
int res=(((x+8)/3)%5)*5;
System.out.println(res);
}

}