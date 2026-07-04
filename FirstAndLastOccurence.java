public class FirstAndLastOccurence {
    public static int first = -1;
    public static int second = -1;

    public static void result(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println("The First Occurnce is : " + first);
            System.out.println("The First Occurnce is : " + second);
            return;
        }
        char curr = str.charAt(index);
        if (curr == element) {
            if (first == -1) {
                first = index;
            } else {
                second = index;
            }
        }
        result(str, index + 1, 'a');
    }

    public static void main(String[] args) {
        String str = "aabaabaccaa";
        result(str, 0, 'a');
    }
}
