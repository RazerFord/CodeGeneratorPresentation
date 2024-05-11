package org.example;

import java.util.ArrayList;
import java.util.List;

public class Geo {
    /* here is very important code */
    public Point getPositionById(int id) {
        /* here is very important code */
        Point point = points.get(id);

        return point;
    }

    private final List<Point> points = new ArrayList<>();

    {
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        p.setZ(30);
        points.add(p);
    }
}
