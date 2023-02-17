import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2) {
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        result.add(arr1[i++]);
      } else {
        result.add(arr2[j++]);
      }
    }
    while (i < arr1.length) {
      result.add(arr1[i++]);
    }
    while (j < arr2.length) {
      result.add(arr2[j++]);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of first array: ");
    int n = scanner.nextInt();
    int[] arr1 = new int[n];
    System.out.print("Enter the elements of first array: ");
    for (int i = 0; i < n; i++) {
      arr1[i] = scanner.nextInt();
    }
    System.out.print("Enter the size of second array: ");
    int m = scanner.nextInt();
    int[] arr2 = new int[m];
    System.out.print("Enter the elements of second array: ");
    for (int i = 0; i < m; i++) {
      arr2[i] = scanner.nextInt();
    }

    ArrayList<Integer> result = mergeArrays(arr1, arr2);

    System.out.print("Merged Array: ");
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
