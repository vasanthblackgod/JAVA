import java.util.Scanner;

public class tappingrainwater {
    public static int maxWater(int[] arr, int n)
    {
  
        int res = 0;
  
        for (int i = 1; i < n - 1; i++) {
  
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
  
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
  
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
  

  public static void main(String[] args) {
    int arr[]= {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
    int n=arr.length;
    System.out.print(maxWater(arr, n));
  }  
}
