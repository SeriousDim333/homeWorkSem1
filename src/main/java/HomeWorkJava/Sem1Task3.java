package HomeWorkJava;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sem1Task3 {
    private static Logger logger = Log.log(Sem1Task3.class.getName());

    public static void main(String[] args) {
        Functions functions = new Functions();
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число: ");
        double firstDigit = Double.parseDouble(scanner.next());
        System.out.print("введите второе число: ");
        double secondDigit = Double.parseDouble(scanner.next());
        System.out.print("введите действие(+,-,*,/): ");
        String action = scanner.next();
        logger.log(Level.INFO, "ответ: " + functions.calc(firstDigit, secondDigit, action));
        //System.out.println("ответ: " + functions.calc(firstDigit, secondDigit, action));

    }
}
