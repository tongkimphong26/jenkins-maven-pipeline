package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        assertEquals(6, app.add(2, 3));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        App app = new App();
        assertEquals(-3, app.add(-1, -2));
    }
}
