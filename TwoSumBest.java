import java.util.Arrays;

public class TwoSumBest {

    // Two Pointer Approach
    public static void findResult(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        System.out.println("-1");
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,5,7,8};
        int target = 8;

        findResult(arr, target);
    }
}