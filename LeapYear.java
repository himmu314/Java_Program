public class LeapYear
{
 public static void main(String args[])
 {
  int y=Integer.parseInt(args[0]);
  System.out.println("Year is: "+y);
  
  if(y%4==0)
  {
    if(y%100==0)
      if(y%400==0)
       System.out.println("Leap Year");
      else
       System.out.println(" NOT A Leap Year");
    else
     System.out.println("Leap Year");
  } 
  else
   System.out.println("NOT A Leap Year");
 }
}
