package com.student;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAppTest {

    private StudentApp app;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Starting Student tests...");
    }

    @BeforeEach
    void setUp() {
        app = new StudentApp();
    }

    @Test
    @DisplayName("Test average calculation")
    void testAverage() {
        assertEquals(85.0, app.getAverage(80, 90));
    }

    @Test
    @DisplayName("Test student passes")
    void testPassedStudent() {
        assertTrue(app.checkPass(75));
    }

    @Test
    @DisplayName("Test student fails")
    void testFailedStudent() {
        assertFalse(app.checkPass(50));
    }

    @Test
    @DisplayName("Test excellent grade")
    void testExcellentGrade() {
        assertEquals("Excellent", app.checkLevel(95));
    }

    @Test
    @DisplayName("Test grade level is not null")
    void testLevelNotNull() {
        assertNotNull(app.checkLevel(80));
    }

    @Test
    @DisplayName("Test wrong grade level")
    void testLevelNotEquals() {
        assertNotEquals("Fail", app.checkLevel(85));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("All Student tests completed");
    }
}