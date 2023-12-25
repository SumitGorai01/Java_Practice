import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int unaffectedChar(String dataStream)
    {
        int answer=0;
        StringBuilder string2=new StringBuilder(dataStream);
        string2=string2.reverse();

        for (int i=0;i<dataStream.length();i++)
        {
            if(dataStream.charAt(i)==string2.charAt(i))
            {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        String dataStream=in.nextLine();

        int result=unaffectedChar(dataStream);
        System.out.print(result);
    }
}