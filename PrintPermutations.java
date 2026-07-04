public class PrintPermutations {

    public static void printPermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; i++) {
            printPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations("", str);
    }
}
