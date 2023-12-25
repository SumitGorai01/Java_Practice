import java.util.*;
class m2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String str=sc.next();
System.out.println("No.of vowels="+count(str));
}
public static int count(String str){
int c=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
c++;
}
return c;
}
}