// A Java program to find if there is a zero sum subarray

import java.util.HashMap;

public class ZeroSumProblem {

    static Boolean isZeroSumSubArray(int arr[]) {
        HashMap<Integer, Integer> hM =
                new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0 || arr[i] == 0 || hM.get(sum) != null) {
                return true;
            }
            hM.put(sum, i);
        }
        return false;
    }

    public static void printallSubarrays(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0)
                    System.out.println("Subarray [" + i + ".." + j + "]");
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = {4, 2, -3, 1, 6};
    }
}