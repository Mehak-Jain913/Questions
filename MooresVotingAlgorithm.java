public class MooresVotingAlgorithm {
    public static void result(int arr[]) {
        int ans = 0;
        int fre = 0;
        for (int i = 0; i < arr.length; i++) {
            if (fre == 0) {
                ans = arr[i];
                fre = 1;
            } else if (arr[i] == ans) {
                fre++;
            } else {
                fre--;
            }
        }

        int count = 0;
        for (int e : arr) {
            if (e == ans) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println("The Majority Element is : " + ans);
            return;
        } else {
            System.out.println("No Majority Element");
            return;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3, 3, 3, 3, 3, 3 };
        result(arr);
    }
}
