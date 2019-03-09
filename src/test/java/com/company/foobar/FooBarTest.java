package com.company.foobar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarTest {

    @Test
    public void shouldReturnStringWhenIntGiven() {
        int anyInt = 16;
        String anyIntAsString = "16";
        FooBar fooBar = new FooBar(anyInt);

        String result = fooBar.asString();

        assertEquals(anyIntAsString, result);
    }

    @Test
    public void shouldReturnStringWhenDifferentIngGiven() {
        int anyInt = 13;
        String anyIntAsString = "13";
        FooBar fooBar = new FooBar(anyInt);

        String result = fooBar.asString();

        assertEquals(anyIntAsString, result);
    }

    @Test
    public void shouldReturnFooWhenNumberIsDivisibleByThree() {
        int divisibleByThree = 69;
        FooBar fooBar = new FooBar(divisibleByThree);

        String result = fooBar.asString();

        assertEquals("Foo", result);
    }

    @Test
    public void shouldReturnFooWhenNumberIsDivisibleByFive() {
        int divisibleByThree = 25;
        FooBar fooBar = new FooBar(divisibleByThree);

        String result = fooBar.asString();

        assertEquals("Bar", result);
    }
}
