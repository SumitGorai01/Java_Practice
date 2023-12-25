import java.util.*;
class minarray{
public static void main(String args[]){
int arr[]={2,-3,5,8,1,0,-4};
int i, min=0;
for(i=0;i<arr.length;i++)
{
if(arr[i]<min){
min=arr[i];
}
}
System.out.println(min);
}
}