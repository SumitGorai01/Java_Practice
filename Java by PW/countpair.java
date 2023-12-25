import java.util.*;
class countpair{
static int countPair(int arr[],int x){
int i,j,count=0;
for(i=0;i<arr.length;i++){
for(j=i+1;j<arr.length;j++){
if(arr[i]+arr[j]==x)
count++;
}
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
System.out.println("Enter no. ");
x=sc.nextInt();
System.out.println("Count of x="+countPair(arr,x));
}
}