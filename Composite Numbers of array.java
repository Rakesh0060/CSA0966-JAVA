 import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] numbers = new int [n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int compositeCount = 0;
        for (int i = 0; i < n; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount > 2) {
                compositeCount++;
            }
        }
        System.out.println("The number of composite numbers in the array is: " + compositeCount);
    }
}
