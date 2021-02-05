package com.example.wk01hw02_loginandlandingpage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testUsername(){
        String a = "Apple_1";
        assertEquals("Apple_1", a);
    }

    @Test
    public void testPassword(){
        String password = "Fruit_1";
        assertEquals("Fruit_1", password);
    }
}