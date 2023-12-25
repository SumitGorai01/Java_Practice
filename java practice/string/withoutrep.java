//wap in java to display a string without repetation of any character
import java.util.*;
class withoutrep
{
    public static void main(String ak[])
    {
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("enter a string:");
        String str1=s.next();
        String str2="";
        for(i=0;i<str1.length();i++)
        {
            char x=str1.charAt(i);
            if(str2.indexOf(x)==-1)
            str2=str2+x;
        }
        System.out.println(str2);
    }
}