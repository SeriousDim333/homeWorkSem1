// Вывести все простые числа от 1 до 1000

package Sem1;

import Func.Functions;

public class Sem1Task2 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        for (int i = 1; i < 100; i++) {
            if (functions.simpleDigit(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
