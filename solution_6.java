import java.util.Scanner;
public class solution_6 {
   public static void main(String args[]) {
	   Scanner in= new Scanner(System.in);
	   
	   
	   System.out.println("Enter the 1st number");
      int n_1 = in.nextInt();
      
      
      System.out.println("Enter the 2nd number");
      int n_2 = in.nextInt();
      
      
      System.out.println("Enter the 3rd number");
      int n_3 = in.nextInt();
      
      
      if (n_1 >= n_2 && n_1 >= n_3)
         System.out.println( n_1 + " is the maximum number.");
      
      
      else if (n_2 >= n_1 && n_2 >= n_3)
         System.out.println( n_2 + " is the maximum number.");
      
      
      else
         System.out.println( n_3 + " is the maximum number.");
   }
}
