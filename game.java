import java.util.*;
class game
{
public static void main(String ak[])
{
int number, guess, nguesses=1;
// creating an object of Random class   
Random random = new Random();   
// Generates random integers 0 to 99  
int x = random.nextInt(100); 
 

srand(time(0));
number = x%100 + 1; /* Generates a random number between 1 and 100

// Keep running the loop until the number is guessed*/
do
{
System.out.print("Guess the number between 1 to 100\n"+nguesses);
int guess = random.nextInt();
System.out.print(+guess);
if(guess>number)
{
System.out.print("Lower number please!\n");
}
else if(guess<number)
{
System.out.print("Higher number please!\n");
}
else
{
System.out.print("You guessed it in attempts\n");
}
nguesses++;
}
while(guess!=number);
 
}    
}