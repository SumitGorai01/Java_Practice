/*
Create a Public class Solution with main method.
Take a value through input for number of students whoose marks are to be taken ,
this will be the size of the array for integers .
Create an array of integers with the size taken as input.
Input the marks in to the array as par the size declared.
Create a static method findMarksMorethanAvg which takes an array of marks as 
input and returns the number of marks which are more than the average.
Call this method and print the returned value in the maun method.
Hint:Use scanner to input the values 
*/

import java.util.*;
class Solution
{
public static void main(String ak[])
{
int n,i,s=0,avg=0,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of Students:");
n=sc.nextInt();	
int a[]=new int[n];
System.out.println("Enter marks of students:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
s=s+a[i];
}
avg=(avg+s/n);
for(i=0;i<a.length;i++)
{
if(a[i]>avg)
{
c++;
}
}
System.out.println(c+"\n This is the total number of marks which are greater than average.");

}
}