import java .util.*;
class m
{
public static void main(String aj[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Which person birthday u want to celebrate first M gandhi or LB sastri\n"); 
System.out.println("If u want to wish m gandhi then enterd even no. and odd for LB sastri");
n=s.nextInt();

if(n%2==0)
{
System.out.println("\nA Very Happy Gandhi Jayanti To All !!!");
System.out.println("\n----About M Gandhi------\n");
System.out.println("He was born on 2 October in a Hindi family at Porbandar in Gujrat.\n"+"His father was the Diwan of Porbandar in Gujrat.\n"+"He was married in May with a lady named Kasturba Makhangi Kapadia.\n"+"He left for higher studies in London on 4trh September 1888.\n"+"He fights against color discrimination and become a civil rights activist in South Africa from 1893.\n"+"He was the founder of the Indian national congress in 1915.\n"+"He started his first movement against British rule in 1917.\n"+"He also launched the non-cooperation movement on 1 august 1920.\n"+"He started the salt march on 12 marches in 1930.\n");
}

else
{
System.out.println("A Very Happy Lal Bhadhur Jayanti To All !!!");
System.out.println("\n----About LB Sastri----\n");
System.out.println(" Lal Bahadur Shastri was the 2nd Prime Minister of India.\n"+" Lal Bahadur Shastri was born on 2nd October 1904 at Mogul Saria in Varanasi.\n"+"Sri Sarada Prasad Srivastava and Srimati Ram Dulari Devi were his parents.\n"+"Lal Bahadur Shastri’s father was a teacher and his mother was a housewife.\n"+"He lost his father at the age of two.\n"+"After Lal Bahadur Shastri’s father’s death due to poverty Lal Bahadur Shastri and his mother lived with his maternal grandparents.\n"+"After completing his primary education, Lal Bahadur Shastri continued his high school studies in Varanasi.\n"+" In 1921 Lal Bahadur Shastri gave up his studies and joined the non-co-operation movement.\n"+"He was jailed for two and a half years.\n"+"After released from jail he joined Kashi Vidyapitha and got the Sastri Degree.");
}
}
}