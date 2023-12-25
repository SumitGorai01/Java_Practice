/*10.Write a program to create your own exception types to handle situation
 specific to your application (Hint: Define a subclass of Exception which
 itself is a subclass of Throwable).*/

import java.util.*;
class myexception extends Exception
{
public String toString()
{
return "Roll Number never be less than or equal to Zero";
}
}
class OwnException
{
public static void main(String ak[])
{
Scanner sc=new Scanner (System.in);
int roll;
System.out.println("Enter roll no.:");
try
{
roll=sc.nextInt();
if(roll<=0)
{
throw new myexception();
}
}
catch(myexception obj)
{
System.out.println(obj);
}
}
}