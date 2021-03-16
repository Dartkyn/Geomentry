package com.geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanglesTest {

    @Test
    void SumPerimeter_32point02() {
        Rectangles rectangles = new Rectangles(2,3, 5.01,6);
        assertEquals(32.02, rectangles.SumPerimeter(),0.001);
    }
}
