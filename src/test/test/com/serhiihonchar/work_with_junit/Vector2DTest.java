package com.serhiihonchar.work_with_junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double DELTA = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createObject() {  //we can use  @Before here without static
        v1 = new Vector2D();  // action
    }

    @Test
    public void shouldReturnZeroLength() {
        //assertion
        double expected = 0.0;
        double actual = v1.length();
        Assert.assertEquals(expected, actual, DELTA);

    }

    @Test
    public void newVectorShouldHaveZeroX() {
        double expected = 0.0;
        double actual = v1.getX();
        Assert.assertEquals(expected, actual, DELTA);
    }
}