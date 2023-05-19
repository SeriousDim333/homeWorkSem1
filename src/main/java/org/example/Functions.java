package org.example;

public class Functions {
    public int factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result*=i;
        }
            return result;
    }
    public int triDidgit(int a){
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result+=i;
        }
        return result;
    }

    public boolean simpleDigit(int a){
        boolean flag = true;
        if(a==1){
            return false;
        }
        for (int i = 2; i <a ; i++) {
            if (a%i==0) {
                flag = false;
            }
        }
        return flag;
    }
}

