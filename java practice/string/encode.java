/*wap in java to a string and encode as
input : abcde
output:fghij

input : abcd
output:defg
*/
import java.util.*;
class encode
{
public static void main(String akb[])
{
Scanner sc=new Scanner(System.in);
int i,y;
System.out.println("Enter String :");
String str1=sc.next();
String str2="";
for(i=0;i<str1.length();i++)
{
char x=str1.charAt(i);
y=x+str1.length();
str2=str2+(char)(y);
}
System.out.println("Your output : "+str2); 
}
}