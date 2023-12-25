/*8.Write a program that show working of different functions of 
String and String Buffer classs like set( Char At, setLength(), 
append(), insert(), concat()and equals().*/

class Q8
{
public static void main(String args[])
{
StringBuffer s=new StringBuffer("Sumit");
String s1="Sumit ";
String s2="Amit";
s.setLength(3);
System.out.println(s.charAt(2)+"\t\tcharAt() String Method");
System.out.println(s+"\t\tsetLength() String Method");
System.out.println(s.append(" Ami")+"\t\tappend() String Method");
System.out.println(s.insert(3," Amit")+"\tinsert() String Method");
System.out.println(s1.concat(s2)+"\tconcat() String Method");
System.out.println(s.equals("Sumit")+"\t\tequals() String Method");
}
}