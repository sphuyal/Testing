package com.sandesh.testing;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Mytest {

    @Test
    public void checkTwoNo(){
        Arithmetic arthimetic = new Arithmetic();
        float expected = 10;
        float actualResult = arthimetic.add(4,6);
        assertEquals(expected,actualResult);

    }
}
