package Homework1;

public class Task10 {
    public static void main(String ... args) {
        String str = "Hello123 world!\nMy name is333 JAVA\nI'12m best programming la44nguage ever\nNo, C++ i235sn't)))";

        char[] chars = str.toCharArray();
        int[] ints = new int[chars.length];
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                ints[j] *= 10;
                ints[j] += Character.getNumericValue(chars[i]);
                if(i + 1 < chars.length && !Character.isDigit(chars[i + 1])) j++;
            }
        }

        for (int i = 0; i < j; i++) System.out.print(ints[i] + " ");
    }
}
