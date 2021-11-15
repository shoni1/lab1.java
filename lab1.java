package lab;

import java.util.Scanner;
public class lab1 {
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
        int answer = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("Минимальное число: " + answer);
    }
}