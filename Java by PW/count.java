import java.util.*;
class count{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]={5,6,5,1,2,5};
int count=0,x;
System.out.println("Enter no. to count:");
 x=sc.nextInt();
for(int i=0;i<6;i++)
{
if(arr[i]==x)
count++;
}
System.out.println(count);
}
}