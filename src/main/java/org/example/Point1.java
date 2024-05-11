package org.example;

import java.util.Objects;

public class Point1 {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void x(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void y(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void z(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point1 point = (Point1) o;
        return x == point.x && y == point.y && z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
