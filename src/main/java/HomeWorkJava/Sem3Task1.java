//Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

package HomeWorkJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class Sem3Task1 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        List<Integer> ints = new ArrayList<>();
        int intsSize = 10;
        functions.fillList(ints, intsSize);
        System.out.println("исходный массив; " + ints);
        System.out.println("минимальное значение = " + Collections.min(ints));
        System.out.println("максимальное значение = " + Collections.max(ints));
        System.out.println("среднее значение = " + String.format("%.1f", ints.stream().mapToInt(a -> a).average().getAsDouble()));
        functions.removeEven(ints);
        System.out.println("массив без четных элементов: " + ints);

    }
}
