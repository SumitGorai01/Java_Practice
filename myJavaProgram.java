import java.util.Scanner;
public class myJavaProgram    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            double kilometres=0;
          
            System.out.println("enter the length in kilometres : ");
            kilometres = sc.nextDouble();

            double miles = kilometres / 1.625;
            System.out.print("The length in miles is: ");
            System.out.println(+miles);


        }
    }