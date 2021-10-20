package com.serhiihonchar.work_with_junit;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {
    @Test
    public void testAdd() {
        int actual = MyClass.add(2, 3);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        int actual = MyClass.add(Integer.MAX_VALUE, 1);
        int expected = Integer.MIN_VALUE;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDiv1() {
        int actual = MyClass.div(8, 4);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDiv2() {
        int actual = MyClass.div(7, 2);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDiv3() {
        MyClass.div(7, 0);

    }

    @Test
    public void testMyClass(){
        MyClass mc = new MyClass(0);
        mc.m();
        //mc.getX() ==> 1;
        int actual = mc.getX();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
