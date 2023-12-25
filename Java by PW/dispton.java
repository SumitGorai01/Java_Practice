import java.util.*;
class dispton{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of N:");
int n=sc.nextInt();
int i;
int arr[]=new int[n];
System.out.println("Enter array element:");
for( i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Your output:");
for(i=0;i<arr.length;i++)
{
if(arr[i]>0)
System.out.println(arr[i]);
}
for(i=0;i<arr.length;i++)
{
if(arr[i]<0)
System.out.println(arr[i]);
}
}
}