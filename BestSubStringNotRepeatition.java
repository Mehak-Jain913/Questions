
import java.util.HashSet;

public class BestSubStringNotRepeatition {

    public static String findResult(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }
        return str.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String str = "abcabcdb";
        String result = findResult(str);
        System.out.println(result);
    }
}