package Sem4;

import Func.Functions;

import java.util.LinkedList;

public class Sem4Task1 {
    public static void main(String[] args) {
        Functions functions = new Functions();
        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        System.out.println(link);
        functions.rev(link);
        System.out.println(link);
    }
}
