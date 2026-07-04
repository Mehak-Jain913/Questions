public class OptimizedBruteForceApproachForMaxSum {

    public static void printArrays(int arr[]) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println("The Maximum sum of the subarray is : " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 9, 2, 4, 5, 6, 7 };
        printArrays(arr);
    }
}

//Only for Positive Numbers->T.C=O(n^2) And S.C=O(1)