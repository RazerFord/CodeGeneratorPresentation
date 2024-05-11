package org.example;

public class Geo {
    /* here is very important code */
    public Point1 getPositionById(int id) {
        Point1 point = points[id];
        /* here is very important code */

        return point;
    }

    private final Point1[] points = new Point1[1000];

    {
        for (int i = 0; i < points.length; i++) {
            Point1 p = new Point1();
            p.x(10);
            p.y(20);
            p.z(30);
            points[i] = p;
        }
    }
}
