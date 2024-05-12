package org.example;

public class Geo {
    /* here is very important code */
    public Point3 getPositionById(int id) {
        Point3 point = points[id];
        /* here is very important code */

        return point;
    }

    private final Point3[] points = new Point3[1000];

    {
        for (int i = 0; i < points.length; i++) {
            Point3 p = new Point3();
            p.setX(10);
            p.setY(20);
            p.setZ(30);
            points[i] = p;
        }
    }
}
