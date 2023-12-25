//wap in java to check a string is palindrome or not

import java.util.*;
class sp
{
public static void main(String ak[])
{
Scanner s =new Scanner(System.in);
System.out.println("Enter a string:");
String str=s.next();
String str1="";
for(int i=str.length()-1;i>=0;i--)
{
str1=str1+str.charAt(i);
}
if(str.equalsIgnoreCase(str1))
System.out.println("Palindrome String.");
else
System.out.println("Not a palindrome String.");
}
}