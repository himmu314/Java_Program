import java.util.Scanner;

class CalArea
{
	private float area;
	
	public CalArea(int n)
	{
		area=n*n;
	}
	
	public CalArea(float r)
	{
		area=3.14f*r*r;
	}
	
	public CalArea(float l,float b)
	{
		area=l*b;
	}
	
	public void displayArea()
	{
		System.out.println("Area:- "+area);
	}
}


public class Area
{
	public static void main(String args[])
	{
		int n,a;
		float r,b;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Choose Option:- ");
		System.out.print("1. Area Of Square\n2. Area Of Circle\n3. Area Of Rectangle\n:- ");
		n=input.nextInt();
		
		switch(n)
		{
			case 1: System.out.print("Enter The SIDE: ");
					a=input.nextInt();
					CalArea obj1=new CalArea(a);
					obj1.displayArea();
					break;
				
			case 2: System.out.print("Enter The RADIUS: ");
					r=input.nextFloat();
					CalArea obj2=new CalArea(r);
					obj2.displayArea();
					break;
					
			case 3: System.out.print("Enter The LENGTH And BREADTH: ");
					r=input.nextFloat();
					b=input.nextFloat();
					CalArea obj3=new CalArea(r,b);
					obj3.displayArea();
					break;
					
			default : System.out.println("Wrong Input......");
		}
		
		
	}
}