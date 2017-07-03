package com.hongfans.testingexample;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2017/7/3 22:42
 */
public class CalculatorTest{

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception{
        mCalculator = new Calculator();
    }

    @Test
    public void sum() throws Exception{
        assertEquals(6d, mCalculator.sum(1d, 5d), 0);
    }

    @Test
    public void substract() throws Exception{
        assertEquals(1d, mCalculator.substract(5d, 4d), 0);
    }

    @Test
    public void divide() throws Exception{
        assertEquals(4d, mCalculator.divide(20d, 5d), 0);
    }

    @Test
    public void multiply() throws Exception{
        assertEquals(10d, mCalculator.multiply(2d, 5d), 0);
    }

}