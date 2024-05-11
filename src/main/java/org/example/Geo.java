package org.example;

public class Geo {
    /* here is very important code */
    public Point getPositionById(int id) {
        Point point = points[id];
        /* here is very important code */

        return point;
    }

    private final Point[] points = new Point[1000];

    {
        for (int i = 0; i < points.length; i++) {
            Point p = new Point();
            p.setX(10);
            p.setY(20);
            p.setZ(30);
            points[i] = p;
        }
    }
}
