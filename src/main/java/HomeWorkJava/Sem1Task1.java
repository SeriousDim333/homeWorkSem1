//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWorkJava;

import java.util.Scanner;

public class Sem1Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int digit = Integer.parseInt(scanner.next());

        Functions functions = new Functions();
        System.out.println("факториал = " + functions.factorial(digit));
        System.out.println("треугольное число = " + functions.triDidgit(digit));
    }
}