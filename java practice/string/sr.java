//wap in java to reverse a string

import java.util.*;
class sr
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a word:");
String str1=s.next();
String str2="";
for(int i=str1.length()-1;i>=0;i--)
{
str2=str2+str1.charAt(i);
}
System.out.println("Reverse of string:="+str2);
}
}