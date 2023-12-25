//wap in java to find the length of a given string without using length() //function

import java.util.*;
class lenw
{
public static void main(String ak[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string :");
String str =s.next();
int i, c=0;
char a[]=str.toCharArray();
for(char ch:a){
c++;
}
System.out.println(c);
}
}