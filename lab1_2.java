package lab;

import java.util.Scanner;
public class lab1_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Введите число a: ");
        a = num.nextInt();
        System.out.print("Введите число b: ");
        b = num.nextInt();
        System.out.print("Введите число c: ");
        c = num.nextInt();
        System.out.print("Введите число d: ");
        d = num.nextInt();
        int answer = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Максимальное число: " + answer);
    }
}
