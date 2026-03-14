public class TwoSumTargetEqual {

    public static void findTwoSum(int[] arr, int target) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The Elements are " + arr[i] + " And " + arr[j]);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("The Two Elements sum not equal to the target");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 6, 7, 8 };
        int target = 20;
        findTwoSum(arr, target);
    }
}
