import java.util.Scanner;
public class solution_9
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String string_original;
    String string_reverse = "";

    System.out.println("Enter a string to reverse");
    string_original = in.nextLine();

    for(int i = string_original.length()-1; i >= 0; i--){    
        string_reverse = string_reverse + string_original.charAt(i);    
    }    

    System.out.println("Reverse of the string: " + string_reverse);
  }
}
