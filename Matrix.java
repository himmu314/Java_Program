import java.util.Scanner;

public class Matrix
{

  public static void getmatrixx(int[][] ar)
  {
    Scanner input=new Scanner(System.in);
 
    for(int i=0;i<ar.length;i++)
      for(int j=0;j<ar[i].length;j++)
        ar[i][j]=input.nextInt();
  }

  public static void putmatrixx(int[][] ar)
  {
    for(int i=0;i<ar.length;i++)
    {
      for(int j=0;j<ar[i].length;j++)
        System.out.print(ar[i][j]+" ");
     System.out.println();
    }
}


 public static void main(String args[])
 {
   int m1,n1,m2,n2;
   Scanner input=new Scanner(System.in);

   System.out.println("Enter The Row & Column of 1st Matrix: ");
   m1=input.nextInt();
   n1=input.nextInt();

   System.out.println("Enter The Row & Column of 2nd Matrix: ");  
   m2=input.nextInt();
   n2=input.nextInt();

   if(n1!=m2)
    System.out.println("The Matrix Multiplication is not possible");
   else
    {
      int[][] ar1=new int[m1][n1];
      int[][] ar2=new int[m2][n2];
      int[][] ar3=new int[m1][n2];

      System.out.println("Enter The "+m1*n1+" Elements:-");
      Matrix.getmatrixx(ar1);
      System.out.println("Enter The "+m2*n2+" Elements:-");
      Matrix.getmatrixx(ar2);

      System.out.println("\nMatrix 1st:-");
      Matrix.putmatrixx(ar1);
      System.out.println("Matrix 2nd:-");
      Matrix.putmatrixx(ar2);

      for(int i=0;i<m1;i++)
       {
         for(int j=0;j<n2;j++)
          {
              ar3[i][j]=0;
              for(int k=0;k<n1;k++)
                ar3[i][j]+=ar1[i][k]*ar2[k][j]; 
          }
       }

      System.out.println("Matrix After Multiplication:-");
      Matrix.putmatrixx(ar3);
    }
 }

}