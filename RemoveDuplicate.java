
import java.util.Set;
import java.util.TreeSet;

/*
 * Given a string s, remove duplicate letters so that every letter appears once
 * and only once. You must make sure your result is the smallest in
 * lexicographical order among all possible results.
 * Example 1:
 * Input: s = "bcabc"
 * Output: "abc"
 * Example 2:
 * Input: s = "cbacdcbc"
 * Output: "acdb"
 */

public class RemoveDuplicate{
    public static void removeDup(String s){
        Set<Character>set=new TreeSet<>();
        for(int i=0;i<s.length();i++)
        if(!(set.contains(s.charAt(i)))){
            set.add(s.charAt(i));
        }
        System.out.println(set);
    }
    public static void main(String[] args){
        String s = "cbacdcbc";
        removeDup(s);
    }
}