//wap in java to count no. of vowels and consonent in a string

import java.util.*;
class countvowel
{
    public static void main(String ak[])
    {
        Scanner s=new Scanner(System.in);
        int c=0,v=0,i;
        System.out.println("enter a String");
        String str=s.next();
        for(i=0;i<str.length();i++)
        {
            char x=str.charAt(i);
            if(x=='a'||x=='e' ||x=='i' ||x=='o' ||x=='u')
            v++;
          else
             c++;

        }
       
        System.out.println("no of vowels="+v);
       System.out.println("no of consonent="+c);
    }
}