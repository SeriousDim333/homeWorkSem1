//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут
//повторяющиеся имена с разными телефонами, их необходимо считать,
//как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.


package Sem5;

import Func.Functions;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sem5Task1 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        HashMap<String, List<String>> nameToPhone = new HashMap<>();

        functions.fillMap(nameToPhone);
        System.out.println(nameToPhone);

        Stream<Map.Entry<String, List<String>>> st = nameToPhone.entrySet().stream();
        st.sorted(Comparator.comparing(x -> x.getValue().size())).forEach(System.out::println);

    }
}
