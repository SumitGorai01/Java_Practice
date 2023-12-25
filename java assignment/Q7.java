/* 7.To find the sum of any number of integers interactively, i.e., 
entering every number from the keyboard, whereas the total number of
 integers is given as a command line argument  */

class Q7
{
public static void main(String [] args)
{
int s=0;
for(int i=0;i<args.length;i++)
{
int n=Integer.parseInt(args[i]);
s=s+n;
}
System.out.println(s);
}
}