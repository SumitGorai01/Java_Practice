import java.util.*;
class countpairdiff {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,x,i,j;
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
for(i=0;i<arr.length;i++){
for(j=i+1;j<arr.length;j++){
if(arr[j]-arr[i]==x){
System.out.println("Yes");
return;
}
}
}
System.out.println("No");
}
}