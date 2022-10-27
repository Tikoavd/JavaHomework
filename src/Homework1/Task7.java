package Homework1;

public class Task7 {
    public static void main(String ... args) {
        int[] arr = new int[] {1, 6, 3, 12, 5, 6, 7, 2, 4, 5};

        int sum = 0, mul = 1;

        for(int num : arr) {
            sum += num;
            mul *= num;
        }

        System.out.println(((double) (sum + mul)) / 2);
    }
}
