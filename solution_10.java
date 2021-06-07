import java.util.Scanner;
public class Ques10 {
 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
  
	  int n;
  System.out.print("Enter a number ");
  n = sc .nextInt();
  int result = n + (n*n) + (n*n*n);
  System.out.printf("The value of n+nn+nnn is " + result);
 }
}
