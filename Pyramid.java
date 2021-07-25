import java.util.Scanner;

public class Pyramid
{
	public static void main(String args[])
	{
		int n;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter The Size Of PYRAMID:-");
		n=input.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n+i;j++)
				if(j<n-1-i)
					System.out.print(" ");
				else
					System.out.print("*");
				
			System.out.println();
		}
		
	}
}
