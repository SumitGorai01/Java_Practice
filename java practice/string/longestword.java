//wap in java to enter a line and find the largest word

import java.util.Scanner;
class longestword
{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a word or sentence:");
       String str = sc.nextLine();
       
       str += " "; //Add space at end of string
       String word = "", lWord = "";
       
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
               
                if (word.length() > lWord.length())
                    lWord = word;
                    
                word = "";
           }
           else {
               word += ch;
           }
       }
       
       System.out.println("The longest word: " + lWord +
        ": The length of the word: " + lWord.length());
    }
    
}