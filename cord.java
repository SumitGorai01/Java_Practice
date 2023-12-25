import java.util.* ;
import java.io.*; 
class cord{
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();

		if(x>0 && y>0)
		{
			System.out.print("1st Quadrant");
		}
		else 
		{
			if(x<0 && y>0)
			{
				System.out.print("2nd Quardrant");
			}
			else
			{
				if(x<0 && y<0)
				{
					System.out.print("3rd Quardrant");
				}
				else
				{
				if(x>0 && y<0)
				{
					System.out.print("4th Quardrant");
				}
				else
				{
					if(x!=0 && y==0)
					{
						System.out.print("x axis");
					}
					else
					{
						if(x==0 && y!=0)
						{
							System.out.print("y axis");
						}
						else
						{
							System.out.print("Origin");
						}
					}
				}
				}

			}
		}
		
	}
}