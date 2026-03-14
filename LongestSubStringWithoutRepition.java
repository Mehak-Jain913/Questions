
import java.util.HashSet;

public class LongestSubStringWithoutRepition {

    public static int findLongestString(String str) {
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean isDup = true;
                HashSet<Character> set = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    if (set.contains(str.charAt(k))) {
                        isDup = false;
                        break;
                    }
                    set.add(str.charAt(k));
                }
                if (isDup) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcdabcbb";
        // Output Should be 3 because the longest substring without repeating characters
        // is "abc"
        int result = findLongestString(str);
        System.out.println(result);
    }
}