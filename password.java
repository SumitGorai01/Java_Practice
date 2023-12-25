import java.util.*;
class password
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int enter,x;
 srand(time(0));
    String alphabet[] = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"}; 
    System.out.println("Enter Length (Minimum 6 ) Of Your Password :");
    enter=s.nextInt();
    //cout<<endl;
    System.out.println("here is your random password of " + enter + " characters:");
    System.out.println("Password = ");
    for(int i = 1; i<= enter; i++) {

        x = 1 + (rand() % 53);
        x--;
      System.out.println(alphabet[x]);
    }
}
}

not completed
