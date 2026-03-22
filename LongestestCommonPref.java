/*
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestestCommonPref {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        // String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
        String str = "   ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true
    }
}

// Difference between indexOf and startsWith:
// indexOf returns the index of the first occurrence of a specified value in a
// string, while startsWith checks if a string starts with a specified value and
// returns a boolean.

// Difference between isEmpty() and isBlank():
// isEmpty() checks if a string is empty (length of 0), while isBlank() checks
// if a string is empty or contains only whitespace characters.