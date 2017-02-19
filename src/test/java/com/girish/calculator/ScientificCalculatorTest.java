package com.girish.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by GirishKumarReddy on 2/19/2017.
 */
public class ScientificCalculatorTest {
    ScientificCalculator scientificCalculator = new ScientificCalculator();

    @Test
    public void testSquare() {
        assertEquals(25, scientificCalculator.square(5), 0);
        assertNotEquals(25, scientificCalculator.square(4), 0);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(10, scientificCalculator.squareRoot(100), 0);
        assertNotEquals(15, scientificCalculator.squareRoot(10), 0);
    }

    @Test
    public void testLog() {
        assertEquals(1.0, scientificCalculator.log(10), 0);
        assertNotEquals(0, scientificCalculator.log(10), 0);
    }

    @Test
    public void testSin() {
        assertEquals(1.0, scientificCalculator.sin(90), 0);
        assertNotEquals(0, scientificCalculator.sin(90), 0);
    }

    @Test
    public void testCosine() {
        assertEquals(-1.0, scientificCalculator.cosine(180.0), 0);
        assertNotEquals(1.0, scientificCalculator.cosine(180.0), 0);
    }

    @Test
    public void testTangent() {
        assertEquals(0.9999999999999999, scientificCalculator.tan(45.0), 0);
        assertNotEquals(0, scientificCalculator.tan(45), 0);
    }
}
