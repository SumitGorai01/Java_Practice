//wap in java to display a string without repetation of any character?

import java.util.*;
class removeds
{
public static void main(String ak[])
{
int i;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String str=sc.nextLine();
String str1="";
for(i=0;i<str.length();i++)
{
 ch =str.charAt(i);
if(str1.indexOf(ch)==-1)
{
str1=str1+ch;
}
}
System.out.println(str1);
}
}