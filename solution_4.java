import java.util.Scanner;
public class solution_4 {

    public static void main(String args[])
       {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = in.nextInt();
        int n_squ = n*n;  
 
        String str_n = Integer.toString(n);  
        String squr = Integer.toString(n_squ);  
 
        if(squr.endsWith(str_n))  
            System.out.println("Automorphic Number.");
        else
            System.out.println("Not an Automorphic Number.");
    }
}
