package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = BinarySearch(arr, 0, arr.length, 10);
        System.out.println(ans);

    }

    public static int BinarySearch(int[] arr, int s, int e, int target) {

      if (s > e ) {
        return -1;
      }
      int m = s + (e - s) / 2;
      if (arr[m] == target) {
        return m;
      }
        if (target < arr[m]) {
        return BinarySearch(arr, target, s, m - 1);
        }
        return BinarySearch(arr, target, m + 1, e);
}
}
