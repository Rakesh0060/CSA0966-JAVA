import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter row and col:");
int row = sc.nextInt();
int col = sc.nextInt();
System.out.print("Input a character: ");
 char a = sc.next().charAt(0);
for (int i = 1; i <=row; i++) {
for (int j = 1; j <= col; j++)
if((i==1 || i==col) || (j==1 || j==col))
System.out.print(a);
else
System.out.print(" ");
System.out.println();
}
}
}
