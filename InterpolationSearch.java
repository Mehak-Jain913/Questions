public class InterpolationSearch {

    public static int interpolationSearch(int arr[] , int low, int high, int target){
        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target) return low;
                return -1;
            }
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if (arr[pos] == target)
                return pos;
            if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int n = arr.length; 
        int target = 18;
        int result = interpolationSearch(arr, 0, n - 1, target);
        System.out.println(result == -1 ? "Element not found" : "Element found at index " + result);
    }
}
