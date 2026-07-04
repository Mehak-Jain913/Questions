public class MajorityElement {

    public static void result(int arr[]) {
        int n = arr.length;

        // Sort the array
        java.util.Arrays.sort(arr);

        int curr = arr[0];
        int fre = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == curr) {
                fre++;
            } else {
                if (fre > n / 2) {
                    System.out.println("The Majority Element is : " + curr);
                    return;
                }
                curr = arr[i];
                fre = 1;
            }
        }

        // Final check for last element
        if (fre > Math.floor(n / 2)) {
            System.out.println("The Majority Element is : " + curr);
        } else {
            System.out.println("No Majority Element exists");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 1, 1};
        result(arr);
    }
}
