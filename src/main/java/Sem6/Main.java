package Sem6;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(Brand.HP, Color.BLACK);
        Laptop laptop2 = new Laptop(Brand.HP, Color.WHITE);
        Laptop laptop3 = new Laptop(Brand.LG, Color.BLACK);
        Laptop laptop4 = new Laptop(Brand.LG, Color.WHITE);

        HashSet<Laptop> laptops = new HashSet<Laptop>();

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        System.out.println(laptops);

        choiceLaptop(laptops);

    }

    static void choiceLaptop(HashSet<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Filter by color - 1, Filter by brand - 2: ");
        String fil = scanner.next();
        switch (fil) {
            case "1": {
                System.out.println("white - 1, black - 2: ");
                String next = scanner.next();
                if (next.equals("1")) {
                    laptops.stream().filter(x -> x.getColor() == Color.WHITE).forEach(System.out::println);
                } else {
                    laptops.stream().filter(x -> x.getColor() == Color.BLACK).forEach(System.out::println);
                }
                break;
            }
            case "2": {
                System.out.println("LG - 1, HP - 2: ");
                String next = scanner.next();
                if (next.equals("1")) {
                    laptops.stream().filter(x -> x.getBrand() == Brand.LG).forEach(System.out::println);
                } else {
                    laptops.stream().filter(x -> x.getBrand() == Brand.HP).forEach(System.out::println);
                }
                break;
            }
            default:{
                System.out.println("wrong command!");
                break;
            }
        }
    }
}
