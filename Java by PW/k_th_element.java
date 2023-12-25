import java.util.*;
class k_th_element{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,j,t,k;
System.out.println("Enter range of array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Enter k th element position: ");
k=sc.nextInt();
System.out.println(a[k]);

}
}