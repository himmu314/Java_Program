import java.util.Scanner;

public class MenuDriven
{
 public static int sum(int n)
 {
  int s=0;
  while(n>0)
  {
   s=s+ n%10;
   n=n/10;
  }
  
  return(s);
 }

 public static int reverse(int n)
 {
  int rev=0,r;
  while(n>0)
  {
    r=n%10;
    rev=rev*10+r;
    n=n/10;
  }
 
  return(rev);
 }
 
 public static long fact(int n)
 {
   long f=1;
   while(n>0)
   {
     f=f*n;
    n--;
   }
  
  return(f);
 }
  
 
 public static void main(String args[])
 {
   int num,n;
   Scanner input=new Scanner(System.in);

   System.out.println("Enter The Number:");
   num=input.nextInt();

   System.out.println("Choose From These:");
   System.out.println("1. Sum of digit\n2. Reverse of number\n3. Factorial of number\n4. Fabonacci Series");
   n=input.nextInt();

  switch(n)
  {
   case 1: System.out.println("\n"+MenuDriven.sum(num));
               break;
   case 2: System.out.println("\n"+MenuDriven.reverse(num));
               break;
   case 3: System.out.println("\n"+MenuDriven.fact(num));
               break;
   case 4: int a=0,b=1,c;
	while(num>0)
	{
	  System.out.print(a+" ");
                   c=a+b;
	  a=b;
	  b=c;
	  num--;
	}
               break;
   default: System.out.println("\nYou Enter Wrong Number..........");
  }
   
 } 
 
}