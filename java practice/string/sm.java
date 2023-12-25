//wap in java to merge two word/string and there must be  a space b/w two string as result

import java.util.*;
class sm
{
public static void main(String ak[]) 
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter two string:");
String str1=s.next();
String str2=s.next();
String str3="";
for( i=0;i<str1.length();i++)
{
str3=str3+str1.charAt(i);
}
str3=str3+" ";
for(i=0;i<str2.length();i++)
{
str3=str3+str2.charAt(i);
}
System.out.println("After merge :"+str3);
}
}