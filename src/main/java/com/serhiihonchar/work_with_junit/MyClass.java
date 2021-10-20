package com.serhiihonchar.work_with_junit;

public class MyClass {
    private int x;

    public MyClass(int x) {
        this.x = x;
    }

    void m() {
        ++x;
    }

    public int getX() {
        return x;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
