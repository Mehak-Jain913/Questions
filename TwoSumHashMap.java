import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

    public static void twoElementsByHashMap(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                System.out.println("Pair: " + complement + " " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 6, 7, 8 };
        int target = 8;

        twoElementsByHashMap(arr, target);
    }
}

//T.C: O(n) because we traverse the array once and perform constant time operations for each element.
//S.C: O(n) in the worst case, if all elements are distinct, we will store all elements in the hash map. In the best case, if we find a pair early, the space complexity can be O(1).