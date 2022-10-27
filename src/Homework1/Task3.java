package Homework1;

public class Task3 {
    public static void main(String ... args) {
        Func(new int[] {1, 4, 7, 18, 9, 44, 56, 5});
    }

    static void Func(int[] arr) {
        Func(arr, arr.length - 1);
    }

    static void Func(int[] arr, int i) {
        if (i == 0) {
            System.out.print(arr[i] + " ");
            return;
        }
        Func(arr, i - 1);
        System.out.print(arr[i] + " ");
    }
}
