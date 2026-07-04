public class SecondLarget {
    public static void SecondLargest(String str) {
        char[] ch = str.toCharArray();
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = ch[i];
            } else if (ch[i] > secondLargest && ch[i] != firstLargest) {
                secondLargest = ch[i];
            }else if(secondLargest == Integer.MIN_VALUE){
                System.out.println("No Second Largest Character");
            }
        }
        System.out.println("Second Largest Character is: " + (char)secondLargest);
    }

    public static void main(String[] args) {
        String str = "banana";
        SecondLargest(str);
    }
}
