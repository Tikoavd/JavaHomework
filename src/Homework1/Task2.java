package Homework1;
import java.util.Scanner;

public class Task2 {
    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);

        int num1 = 1;
        int num2 = 1;

        System.out.print("Enter n: ");
        int n = in.nextInt();

        while (n > 1) {
            num2 += num1;
            num1 = num2 - num1;
            n--;
        }

        System.out.println("\nFibonacci number: " + num2);
    }
}
