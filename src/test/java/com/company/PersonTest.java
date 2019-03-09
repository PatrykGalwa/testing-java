package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void shouldReturnFullName() {

    }

    @Test
    public void shouldHasFullNameWhenHasFirstAndSecondName() {
        //gives
        Person person = new Person("Patryk", "Gałwa");

        //when
        boolean result = person.hasFullName();

        //then
        assertTrue(result);
    }

    @Test
    public void shouldHasNoFullNameWhenHasNoFirstOrSecondName() {
        //gives
        Person person = new Person();

        //when
        boolean result = person.hasFullName();

        //then
        assertFalse(result);
    }
}