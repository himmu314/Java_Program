import java.util.Scanner;

public class EMI
{
  public static double pow(double n, int p)
  {
    double k=1;
    while(p>0)
     {
       k=k*n;
       p--;
      }
     return(k);
   }
 
  public static void main(String args[])
   {
     Scanner input=new Scanner(System.in);
      double p,r;
      double emi;
      int n;
      
     System.out.print("Enter The Total Amount: ");
      p=input.nextDouble();
      System.out.print("Enter The Interest Rate: ");
       r=input.nextDouble();
      System.out.print("Enter The Total Years: ");
      n=input.nextInt();

      r=r/12;       //convert yearly interest rate into monthly
      emi=( p*(r/100)*EMI.pow((1.0 + r/100), n*12) ) / (EMI.pow((1.0 + r/100),n*12)- 1 );     
	  
	  System.out.println("Choose The Option:-");
      System.out.print("1. EMI Monthly\n2. EMI Annually\n:- ");
 	  n=input.nextInt();
		
		switch(n)
		{
			case 1: System.out.println("\nEMI Is: "+emi); 
					break;
			case 2: System.out.println("\nEMI Is: "+emi*12);
					break;
			default : System.out.println("You Enter THe WRONG Value\n");
		}
    }
}