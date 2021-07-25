import java.util.Scanner;

public class Pattern
{
	public static void pdiagonal(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<=i;j++)
				if(i==j)
					System.out.print(ar[i][j]+" ");
				else
					System.out.print(" "+" ");
			System.out.println();
		}
	}
	
	
	
	public static void sdiagonal(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length-i;j++)
				if((i+j)==ar[i].length-1)
					System.out.print(ar[i][j]+" ");
				else
					System.out.print(" "+" ");
			System.out.println();
		}
	}
	
	
	public static void lleft(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(ar[i][j]+" ");
			System.out.println();
		}		
	}
	
	
	public static void uleft(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i;j++)
				System.out.print(ar[i][j]+" ");
			System.out.println();
		}
	}
	
	
	
	public static void uright(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
				if(j<i)
					System.out.print(" "+" ");
				else
					System.out.print(ar[i][j]+" ");
				
			System.out.println();	
		}
	}
	
	
	public static void lright(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
				if(j>=ar[i].length-1-i)
					System.out.print(ar[i][j]+" ");
				else
					System.out.print(" "+" ");
				
			System.out.println();
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n;
		
		int[][] arr={{1,2,3,4,5},{5,6,7,8,9},{0,2,6,2,7},{9,2,5,0,3},{7,3,0,1,2}};
		
		System.out.println("Elements Of Array:-");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Choose Option: ");
		System.out.print("1. Upper Left\n2. Upper Right\n3. Lower Left\n4. Lower Right\n5. Primary Diagonal\n6. Secondary Diagonal\n:- ");
		n=input.nextInt();
		
		switch(n)
		{
			case 1: Pattern.uleft(arr);
					break;
			case 2: Pattern.uright(arr);
					break;
			case 3: Pattern.lleft(arr);
					break;
			case 4: Pattern.lright(arr);
					break;
			case 5: pdiagonal(arr);
					break;
			case 6: sdiagonal(arr);
					break;
			default: System.out.println("You Enter The Wrong Value");
			
		}
		
	}
}