import java.util.*;
class count1{
static int count(int arr[],int x){
int i,count=0;
for(i=0;i<arr.length;i++){
if(arr[i]==x)
count++;
}
return count;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,x,i;
System.out.println("Enter size of array:");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter no. to count");
x=sc.nextInt();
System.out.println("Count of x="+count(arr,x));
}
}