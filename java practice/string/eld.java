//wap in java to enter a line and display each word

import java.util.*;
class eld
{
public static void main(String ak[])
{
Scanner s =new Scanner(System.in);
System.out.println("Enter a Line:");
String str=s.nextLine();
String str1="";
int i;
for(i=0;i<str.length();i++)
{
char x=str.charAt(i);
if(x==' ')
{
System.out.println(str1);
str1=" ";
}
else
str1=str1+x;
}
}
}