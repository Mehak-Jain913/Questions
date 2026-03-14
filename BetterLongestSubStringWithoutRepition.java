
import java.util.HashSet;

public class BetterLongestSubStringWithoutRepition {

    public static int findLongestString(String str) {
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if (set.contains(str.charAt(j))) {
                    break;
                }
                set.add(str.charAt(j));
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
