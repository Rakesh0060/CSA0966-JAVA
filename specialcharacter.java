 import java.util.Scanner;

public class SpecialCharacterCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a line of text: ");
    String line = sc.nextLine();
    
    int count = 0;
    System.out.print("Special characters: ");
    for (int i = 0; i < line.length(); i++) {
      char ch = line.charAt(i);
      if (!Character.isLetterOrDigit(ch)) {
        count++;
        System.out.print(ch + " ");
      }
    }
    
    System.out.println("\nNumber of special characters: " + count);
  }
}
