package Homework1;

import java.util.Arrays;

public class Task4 {
    public static void main(String ... args) {
        System.out.println(Meth("Hello world!"));
    }

    static String Meth(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char ch = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = ch;
        }
        return String.valueOf(chars);
    }
}
