package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2)
                        + Math.pow(this.y - point.y, 2));
    }

    public double distance3D(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2)
                        + Math.pow(this.y - point.y, 2)
                        + Math.pow(this.z - point.z, 2));
    }
}
