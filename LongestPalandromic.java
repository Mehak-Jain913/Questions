/*
 * Given a string s, return the longest palindromic substring in s.
 * 
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * 
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 */

public class LongestPalandromic{
    public static int max;
    public static String sust;

    public static void count(String sub){
        int count=0;
        for(int i=0;i<sub.length();i++){
            count++;
        }
        if(count>max){
            max=count;
            sust=sub;
        }
    }

    public static boolean isPalindrome(String sub){
        Boolean isPalindrome=true;
        for(int i=0;i<sub.length();i++){
            if(sub.charAt(i)!=sub.charAt(sub.length()-i-1)){
                isPalindrome=false;
            }
        }
        return isPalindrome;
    }

    public static void allSubstring(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i , j+1);
                if(isPalindrome(sub)){
                    count(sub);
                }
            }
        }
    }
    public static void main(String[] args){
        String s = "babad";
        allSubstring(s);
        System.out.println(max);
        System.out.println(sust);
    }
}