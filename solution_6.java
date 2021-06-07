import java.util.Scanner;
public class Ques6 {
   public static void main(String args[]) {
	   Scanner sc= new Scanner(System.in);
	   
	   
	   System.out.println("Enter the first number");
      int n_1 = sc.nextInt();
      
      
      System.out.println("Enter the second number");
      int n_2 = sc.nextInt();
      
      
      System.out.println("Enter the third number");
      int n_3 = sc.nextInt();
      
      
      if (n_1 >= n_2 && n_1 >= n_3)
         System.out.println( n_1 + " is the maximum number.");
      
      
      else if (n_2 >= n_1 && n_2 >= n_3)
         System.out.println( n_2 + " is the maximum number.");
      
      
      else
         System.out.println( n_3 + " is the maximum number.");
   }
}
