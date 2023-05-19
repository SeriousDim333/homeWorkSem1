// Вывести все простые числа от 1 до 1000

package org.example;

public class Task2 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        for (int i = 1; i < 100; i++) {
            if (functions.simpleDigit(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
