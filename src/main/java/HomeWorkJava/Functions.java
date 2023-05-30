package HomeWorkJava;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Collections;

public class Functions {
    public int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public int triDidgit(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        return result;
    }

    public boolean simpleDigit(int a) {
        boolean flag = true;
        if (a == 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public double calc(double a, double b, String c) {
        if (Objects.equals(c, "+")) {
            return a + b;
        } else if (Objects.equals(c, "-")) {
            return a - b;
        } else if (Objects.equals(c, "/")) {
            if (b==0) throw new RuntimeException("на ноль делить нельзя");
            return a / b;
        } else {
            return a * b;
        }
    }

    public String jsonPars(String str){
        String[] arrstr = str.split(",");
        String result = "";
        for (String string : arrstr) {
            int flag = 0;
            if (!string.contains("null")) {
                StringBuilder sb = new StringBuilder(string);
                for (int i = 0; i < sb.length(); i++) {
                    if (sb.charAt(i) == ':') {
                        sb.setCharAt(i, '=');
                    } else if (sb.charAt(i) == '{' || sb.charAt(i) == '}') {
                        sb.deleteCharAt(i);
                        i--;
                    } else if (sb.charAt(i)=='"'&& flag<2) {
                        sb.deleteCharAt(i);
                        flag++;
                        i--;
                    }
                }
                result += sb.toString()+ " and";
            }
        }
        StringBuilder resB = new StringBuilder(result);
        resB.delete(result.length()-4,result.length());
        resB.append(';');
        return resB.toString();
    }

    public void fillList(List<Integer> ints, int intsSize){
        Random rnd = new Random();
        for (int i = 0; i < intsSize; i++) {
            ints.add(rnd.nextInt(100));
        }
    }

    public void removeEven(List<Integer> ints){
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) %2==0){
                ints.remove(i);
                i--;
            }
        }
    }

    public LinkedList  rev(LinkedList link){
        Collections.reverse(link);
        return link;
    }
}



