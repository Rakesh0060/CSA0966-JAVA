import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the ending number (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of numbers to skip (k): ");
        int k = sc.nextInt();
        sc.close();

        System.out.println("Numbers from " + m + " to " + n + " (skip " + k + "):");
        for (int i = m; i <= n; i = i + k + 1) {
            System.out.println(i);
        }
    }
}
