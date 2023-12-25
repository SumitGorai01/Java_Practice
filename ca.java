/*wap in java to produce the output like
input :-   
        first string        :    sumit   
        second string  :    gorai
output                     :    sguomriati 
*/

import java.util.*;
class ca
{
public static void main(String ag[])
{
String str1,str2;
int str3,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter first string");
str1=s.nextLine();
System.out.println("First string is "+str1);
System.out.println("Enter second string");
str2=s.nextLine();
System.out.println("Second string is "+str2);

str3=str1.length()+str2.length();
System.out.println("length of both string="+str3);
for(i=0;i<=str3;i++)
{
System.out.print(str1.charAt(i));
System.out.print(str2.charAt(i));
}
System.out.println("\n");
}
}