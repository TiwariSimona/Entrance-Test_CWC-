import java.util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		  int a = 0, b = 1, c = 1, d = 2, i;
		  int e=0;
		  System.out.print(a + " " + b + " " + c+" "+d);
		  
		  for (i = 4; i <= n; i++) {
		   e =  b +c+d;
		   System.out.print(" " + e);
		   b = c;
		   c = d;
		   d = e;
		  }
		  }
}
