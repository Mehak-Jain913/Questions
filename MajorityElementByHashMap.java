import java.util.HashMap;

public class MajorityElementByHashMap {

    public static int result(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length / 2) {
                System.out.println("The Majority Element is: " + key);
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        result(arr);
    }
}
