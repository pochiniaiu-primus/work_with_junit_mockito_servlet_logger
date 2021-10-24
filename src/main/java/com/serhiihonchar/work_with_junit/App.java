package com.serhiihonchar.work_with_junit;

public class App {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int div(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return x / y;
    }
}
