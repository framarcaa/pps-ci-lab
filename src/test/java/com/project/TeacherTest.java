package com.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    @Test
    void testShouldReturnTeacherName() {
        Teacher teacher = new Teacher("Alice Smith", "Mathematics");

        assertEquals("Alice Smith", teacher.getName());
    }

    @Test
    void testShouldReturnTeacherSubject() {
        Teacher teacher = new Teacher("Bob Johnson", "History");

        assertEquals("History", teacher.getSubject());
    }
}
