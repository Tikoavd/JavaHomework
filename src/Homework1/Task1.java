package Homework1;

public class Task1 {
    public static void main(String ... args) {
        for (int i = 1; i < 20; i++)
            System.out.println(FiboRec(i));
    }

    static int FiboRec(int n) {
        if (n < 1) return 0;
        return FiboRec(n, 1, 1);
    }

    static int FiboRec(int n, int num1, int num2) {
        if (n == 1) return num2;
        return FiboRec(n - 1, num2, num1 + num2);
    }
}
