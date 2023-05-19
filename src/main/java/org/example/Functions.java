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
}

