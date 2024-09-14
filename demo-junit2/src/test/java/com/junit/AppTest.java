package com.junit;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    void testSum() {
        assertEquals(5, App.sum(3, 2));

    }

    @Test
    void testSubtract() {
        assertEquals(4, App.subtract(10, 6));
        assertEquals(8, App.subtract(11, 3));

    }

    @Test
    void testCombine() {
        // Scenario 1: x >= 10 and y >= 3 -> subtract()
        assertEquals(7, App.combine(10, 3));
        // Scenario 2: x < 10 and y >= 3 -> sum()
        assertEquals(12, App.combine(9, 3));
        // Scenario 3: x >= 10 and y < 3 -> sum()
        assertEquals(12, App.combine(10, 2));
        // Scenario 4: x < 10 and y < 3 -> sum()
        assertEquals(11, App.combine(9, 2));

        assertEquals(8, App.combine(11, 3)); // !!!! meaningless
        /// !!! Bacause this test case is testing the same thing with "App.combine(10,
        /// 3)"
    }

    @Test
    void testAssert() {
        String s1 = new String();
        String s2 = new String();
        assertNotSame(s1, s2);
        String s4 = null;
        assertNull(s4);
    }
}
