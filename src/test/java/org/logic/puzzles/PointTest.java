package org.logic.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    @Test
    public void given_twoPoints_return_distance() {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 7);
        assertEquals(5, point1.distance(point2), 0);
    }
}