import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the ending number (b): ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Composite numbers between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }

        return false;
    }
}
