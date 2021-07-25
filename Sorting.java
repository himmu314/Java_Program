import java.util.Scanner;

public class Sorting
{
  public static void selectionSort(int[] ar)
  {
    int temp,m;
    for(int i=0;i<ar.length;i++)
    {
      m=i;
      for(int j=i;j<ar.length;j++)
        if(ar[m]>ar[j])
          m=j;

       if(m!=i)
       {
         temp=ar[m];
         ar[m]=ar[i];
         ar[i]=temp;
       }
    }
  }

 
 public static void bubbleSort(int[] ar)
  {
    int temp;
    for(int i=0;i<ar.length;i++)
     for(int j=0;j<ar.length-1-i;j++)
       if(ar[j]>ar[j+1])
       {
         temp=ar[j];
         ar[j]=ar[j+1];
         ar[j+1]=temp;
       }
  } 


 public static void insertionSort(int[] ar)
  {
    int k,j;
    for(int i=1;i<ar.length;i++)
     { 
       k=ar[i];
       for(j=i-1;j>=0;j--)
        {
          if(ar[j]>k)
           ar[j+1]=ar[j];
		else
            break;
        } 
       j++;
      ar[j]=k;
     }
  }


 public static void main(String args[])
 {
   int n;
   Scanner input=new Scanner(System.in);
   
   System.out.print("Enter The No. Of Elements: ");
   n=input.nextInt();

   int[] arr=new int[n];
   System.out.println("Enter "+n+" Elements:- ");
   for(int i=0;i<n;i++)
     arr[i]=input.nextInt();

   System.out.println("Choose The Option:- ");
   System.out.print("1. Selection Sort\n2. Bubble Sort\n3. Insertion Sort\n:- ");
   n=input.nextInt();

   switch(n)
   {
     case 1: selectionSort(arr);
                  break;
     case 2: bubbleSort(arr);
                  break;
     case 3: insertionSort(arr);
                  break;
     default: System.out.println("You Enter The Wrong Value");
   }
    
   System.out.println("\nThe Sorted Array Is:-");
    for(int i=0;i<arr.length;i++) 
      System.out.print(arr[i]+" "); 
      
 }

}