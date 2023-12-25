import java.util.Scanner;
class c3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Cost Price:");
double cp=sc.nextInt();
System.out.println("Enter Selling Price:");
double sp=sc.nextInt();
if(cp>sp)
{
double loss=cp-sp;
System.out.println("Loss="+loss);
}
else
{
double profit=sp-cp;
System.out.println("Profit="+profit);
}

}
}