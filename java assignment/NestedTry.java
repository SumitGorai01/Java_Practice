/*9.Write a program to show the use of nested try statements that emphasizes
 the sequence of checking for catch handler statements.*/

import java.util.*;
class NestedTry
{
public static void main(String ak[])
{
try
{
System.out.println("Outer try block starts");
try
{
System.out.println("Inner try block starts");
int res=6/0;
}
catch(InputMismatchException e)
{
System.out.println("InputMismatchException caught");
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException caught in inner block");
}
finally
{
System.out.println("Inner final block");
}
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException caught in outer block");
}
finally
{
System.out.println("Outer finally block");
}
}
}