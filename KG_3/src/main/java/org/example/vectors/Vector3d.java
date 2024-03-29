package org.example.vectors;

public class Vector3d extends AbstractVector<Vector3d> implements Comparable<Vector2d> {
    public Vector3d() {
        super(3);
    }

    public Vector3d(double x, double y, double z) {
        super(3, new double[]{x, y, z});
    }

    public Vector3d(double[] coords) {
        super(3, coords);
    }

    public double x() {
        return coords[0];
    }

    public double y() {
        return coords[1];
    }

    public double z() {
        return coords[2];
    }

    public void setX(double x) {
        coords[0] = x;
    }

    public void setY(double y) {
        coords[1] = y;
    }

    public void setZ(double z) {
        coords[2] = z;
    }

    public Vector3d crossProd(Vector3d v) {
        double x = this.y() * v.z() - this.z() * v.y();
        double y = this.z() * v.x() - this.x() * v.z();
        double z = this.x() * v.y() - this.y() * v.x();

        return new Vector3d(x, y, z);
    }

    public Vector3d crossProd(Vector3d v1, Vector3d v2) {
        double x = v1.y() * v2.z() - v1.z() * v2.y();
        double y = v1.z() * v2.x() - v1.x() * v2.z();
        double z = v1.x() * v2.y() - v1.y() * v2.x();

        setCoords(new double[]{x, y, z});
        return new Vector3d(x, y, z);
    }

    @Override
    protected Vector3d initialReturnThis() {
        return this;
    }

    @Override
    public int compareTo(Vector2d o) {
        int cmp = Double.compare(this.y(), o.y());
        if (cmp != 0) {
            return cmp;
        } else return Double.compare(this.x(), o.x());
    }
}
