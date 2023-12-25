///wap in java to count no. of vowels

import java.util.*;
class cv
{
public static void main(String ak[])
{
int c=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a string:");
String str=s.next();
for(int i=0;i<str.length();i++)
{
char x=str.charAt(i);
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
c++;

}
System.out.println("No.of vowels="+c);
}
}