//wap in java to check the string is palindrome or not using string //buffer

import java.util.*;
class spb
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a word:");
String str1=s.next();
String str2="";
for(int i=0;i<str1.length();i++)
{
char x=str1.charAt(i);
if(str2.indexOf(x)==-1)
str2=str2+x;

}
System.out.println(str2);
}
}