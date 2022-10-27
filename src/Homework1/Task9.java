package Homework1;

public class Task9 {
    public static void main(String ... args) {
        String str = "Hello world!\nMy name is JAVA\nI'm best programming language ever\nNo, C++ isn't)))";
        String[] strings = str.split("\n");

        String min = str;
        String max = "";
        for (String str1 : strings) {
            if (str1.length() < min.length()) min = str1;
            if (str1.length() > max.length()) max = str1;
        }

        System.out.println(min + "\n" + max);
    }
}
