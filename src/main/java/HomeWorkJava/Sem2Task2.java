//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HomeWorkJava;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sem2Task2 {
    private static Logger logger = Log.log(Sem2Task2.class.getName());

    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        int count = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
            count++;
            logger.log(Level.INFO, "step " + count + ": " + Arrays.toString(mas));
        }
    }
}
