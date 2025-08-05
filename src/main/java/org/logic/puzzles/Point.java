package org.logic.puzzles;

public record Point(double x, double y) {
    public double distance(Point point) {
        if (point == null)
            throw new RuntimeException("Points are not initialized");
        double dx = this.x - point.x;
        double dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
