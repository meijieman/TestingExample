package com.hongfans.junitdemo;

import junit.framework.TestCase;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2017/7/5 1:06
 */
public class TestSimple extends TestCase{

    @Override
    protected void setUp() throws Exception{
        super.setUp();

    }

    @Override
    protected void tearDown() throws Exception{
        super.tearDown();
        
    }

    public void testAdd(){
        assertEquals(2 , 1 + 1);
    }
}
