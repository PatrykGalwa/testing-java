package com.company;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class CourseTest {

    public static final String ANY_COURSE_NAME = "";


    @Test
    public void shouldHaveTheSameName() {

        Course course = new Course(ANY_COURSE_NAME, LocalDate.now());

        String result = course.name();

        assertEquals(ANY_COURSE_NAME, result);
    }

    @Test
    public void shouldHaveStartDateBefore() {
        Course course = new Course(ANY_COURSE_NAME, LocalDate.of(2017, 2, 4));
        LocalDate present = LocalDate.of(2019, 3,2);

        boolean result = course.wasStartedBefore(present);

        assertTrue(result);
    }

    @Test
    public void shouldHaveStartDateNotBefore() {

        Course course = new Course(ANY_COURSE_NAME, LocalDate.of(2017, 2, 4));
        LocalDate present = LocalDate.of(2019, 3,2);

        boolean result = course.wasStartedBefore(present);

        assertFalse(result);


    }

}