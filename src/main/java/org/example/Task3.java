package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число: ");
        double firstDigit = Double.parseDouble(scanner.next());
        System.out.print("введите второе число: ");
        double secondDigit = Double.parseDouble(scanner.next());
        System.out.print("введите действие(+,-,*,/): ");
        String action = scanner.next();

        System.out.println("ответ: " + functions.calc(firstDigit, secondDigit, action));
    }
}
