package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);

        int number, k;
        System.out.print("Enter number: ");
        number = in.nextInt();
        System.out.print("Enter k: ");
        k = in.nextInt();

        System.out.println(Meth(number, k));
    }

    static int Meth(int num, int k) {
        int num2 = 0;
        while (num > 0) {
            num2 *= 10;
            num2 += num % 10;
            num /= 10;
        }

        num = 0;
        while (k > 0 && num2 > 0) {
            num *= 10;
            num += num2 % 10;
            num2 /= 10;
            k--;
        }

        return num;
    }
}
