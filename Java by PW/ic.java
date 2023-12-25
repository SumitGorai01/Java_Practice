import java.util.Scanner;
class ic{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int mark1=sc.nextInt();
int mark2=sc.nextInt();
int mark3=sc.nextInt();
int total_marks=mark1+mark2+mark3;
int per=(total_marks/3);
System.out.println("Total marks:"+total_marks);
System.out.println("Percentage marks:"+per+"%");
}
}