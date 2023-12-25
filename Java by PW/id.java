import java.util.Scanner;
class id{
public static void main(String args[]){
int sum=0;
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
int num1=sc.nextInt();
int num2=sc.nextInt();
sum=num1+num2;
System.out.println(sum);
}

}
}