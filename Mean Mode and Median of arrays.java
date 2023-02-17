import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 4, 5, 6};

    double mean = findMean(arr);
    System.out.println("Mean: " + mean);

    double median = findMedian(arr);
    System.out.println("Median: " + median);

    int mode = findMode(arr);
    System.out.println("Mode: " + mode);
  }

  public static double findMean(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return (double) sum / arr.length;
  }

  public static double findMedian(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    if (n % 2 == 0) {
      return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2;
    } else {
      return (double) arr[n / 2];
    }
  }

  public static int findMode(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    int maxCount = 0, mode = -1;
    for (int i : arr) {
      int count = map.getOrDefault(i, 0) + 1;
      map.put(i, count);
      if (count > maxCount) {
        maxCount = count;
        mode = i;
      }
    }
    return mode;
  }
}
