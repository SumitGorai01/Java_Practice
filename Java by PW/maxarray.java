import java.util.*;
class maxarray{
public static void main(String args[]){
int arr[]={2,-3,5,8,1,0,-4};
int i, max=0;
for(i=0;i<arr.length;i++)
{
if(arr[i]>max){
max=arr[i];
}
}
System.out.println(max);
}
}