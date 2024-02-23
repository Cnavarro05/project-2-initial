package com.csc205.project2;

public class Cylinder extends Shape{

        private double height;
        private double radius;

        public Cylinder() {
            super();
            this.height = 4.0;
            this.radius = 1.0;
        }

        public Cylinder(double height, double radius) {
            super();
            this.height = height;
            this.radius = radius;
        }

    public Cylinder(double v) {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double radius) {
        this.height = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2.0 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }




}
