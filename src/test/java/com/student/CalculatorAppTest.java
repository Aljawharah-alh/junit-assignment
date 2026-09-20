package com.student;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAppTest {

    private CalculatorApp app;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Starting all tests...");
    }

    @BeforeEach
    void setUp() {
        app = new CalculatorApp();
    }

    @Test
    @DisplayName("Test addition")
    void testAdd() {

        assertEquals(5, app.performAdd(2, 3));
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtract() {

        assertEquals(6, app.performSubtract(10, 4));
    }

    @Test
    @DisplayName("Test positive number")
    void testPositiveNumber() {

        assertTrue(app.checkPositive(7));
    }

    @Test
    @DisplayName("Test negative number")
    void testNegativeNumber() {

        assertFalse(app.checkPositive(-5));
    }

    @Test
    @DisplayName("Test message is not null")
    void testMessageNotNull() {

        assertNotNull(app.getMessage());
    }

    @Test
    @DisplayName("Test result is not equal")
    void testNotEquals() {

        assertNotEquals(10, app.performAdd(2, 3));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("All tests finished");
    }
}