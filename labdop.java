package lab;

import java.util.Scanner;
public class labdop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = num.nextInt();
        String result;
        if (month == 1 || month == 2 || month == 12) {
            result = "Зима";
        } else if (month == 3 || month == 4 || month == 5) {
            result = "Весна";
        } else if (month == 6 || month == 7 || month == 8) {
            result = "Лето";
        } else if (month == 9 || month == 10 || month == 11) {
            result = "Осень";
        } else result = "Нет такого месяца!";
        System.out.println(result);
    }
}