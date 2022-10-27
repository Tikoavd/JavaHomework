package Homework1;

import java.util.Arrays;

public class Task5 {
    public static void main(String ... args) {
        Integer[] arr = new Integer[] {1, 2, 7, 14, 15, 8, 19, 21};
        String[] str = new String[] {"Hello", "World", "Actually", "My", "Name", "is", "JAVA"};

        Integer[] newarr = Meth(arr, 3, Integer[]::new);
        String[] newstr = Meth(str, 2, String[]::new);

        System.out.println(Arrays.toString(newarr));
        System.out.println(Arrays.toString(newstr));
    }

    static <T> T[] Meth(T[] arr, int index, ArrayGenerator<T[]> arrgen) {
        T[] newarr = arrgen.func(arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            if (i < index) newarr[i] = arr[i];
            else if (i > index) newarr[i - 1] = arr[i];
        }

        return newarr;
    }

    interface ArrayGenerator<T> {
        T func(int n);
    }
}
