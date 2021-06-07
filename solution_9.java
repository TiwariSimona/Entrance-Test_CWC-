import java.util.Scanner;
public class Ques9
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String string;
    String reverse = "";

    System.out.println("Enter a string to reverse");
    string = sc.nextLine();

    for(int i = string.length()-1; i >= 0; i--){    
        reverse = reverse + string.charAt(i);    
    }    

    System.out.println("Reverse of the string: " + reverse);
  }
}
