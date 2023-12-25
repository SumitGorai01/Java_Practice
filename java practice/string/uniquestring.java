//wap in java to check the string is unique or not

import java.util.*;
class uniquestring
{
public static void main(String akb[])
{
Scanner sc=new Scanner(System.in);
int i,j,c=0,f=0;
System.out.println("Enter String");
String str1=sc.next();
for(i=0;i<str1.length();i++)
{
char x=str1.charAt(i);
for(j=0;j<str1.length();j++)
{
char y=str1.charAt(j);
if(x==y)
c++;
}
if(c>1)
{
System.out.println("Not Unique String");
f++;
break;
}
c=0;
}
if(f==0)
System.out.println("Unique String");
}
}