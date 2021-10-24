package com.serhiihonchar.work_with_junit;

import org.junit.*;

public class AppTest {
    App app;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void testAdd() {
        System.out.println("test1");
    }

    @Test
    public void testAdd2() {
        System.out.println("test2");
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        App.div(5, 0);
    }
}