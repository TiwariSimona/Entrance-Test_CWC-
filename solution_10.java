import java.util.Scanner;

public class solution_10 {
 public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
           int n;
	 
  System.out.print("Enter  number ");
  n = in .nextInt();
  int result = n + (n*n) + (n*n*n);
  System.out.printf("The value of n+nn+nnn is " + result);
 }
}
