import java.util.Scanner;

class Record
{
  private int roll,cls,age;
  private String name,fname,address;
  
 
  public void getdata()
  {
    Scanner input=new Scanner(System.in);
    
    System.out.print("Enter Name: ");
     name=input.nextLine();
    System.out.print("Enter Father's Name: ");
     fname=input.nextLine();
    System.out.print("Enter Address: ");
     address=input.nextLine();

    System.out.print("Enter Roll No.: ");
     roll=input.nextInt();
    System.out.print("Enter Class: ");
     cls=input.nextInt();
    System.out.print("Enter Age: ");
     age=input.nextInt(); 
  }

  public void putdata()
  {
    System.out.print("Name: "+name);
    System.out.println("\t\tRoll No.: "+roll);
    System.out.print("Class: "+cls);
    System.out.println("\t\t\tAge: "+age);
    System.out.println("Father's Name: "+fname);
    System.out.println("Address: "+address);     
  }
}

public class StudentRecord
{
  public static void main(String args[])
  {
    Record obj=new Record();
    System.out.println("Enter The given below data:-");
    obj.getdata();

    System.out.println("\nStudent Data:-");
    obj.putdata();
  }
}