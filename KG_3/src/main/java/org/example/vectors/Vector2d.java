package org.example.vectors;

public class Vector2d extends AbstractVector<Vector2d> {

    public Vector2d() {
        super(2);
    }

    public Vector2d(double x, double y) {
        super(2, new double[]{x, y});
    }

    public Vector2d(double[] coords) {
        super(2, coords);
    }

    public double x() {
        return coords[0];
    }

    public double y() {
        return coords[1];
    }

    public void setX(double x) {
        coords[0] = x;
    }

    public void setY(double y) {
        coords[1] = y;
    }

    public double crossMagnitude(Vector2d v) {
        return coords[0] * v.y() - coords[1] * v.x();
    }

    @Override
    protected Vector2d initialReturnThis() {
        return this;
    }
}
