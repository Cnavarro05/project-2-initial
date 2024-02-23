package com.csc205.project2;

public class Cuboid extends Shape{

    private double height;
    private double width;
    private double length;

    public Cuboid() {
        super();
        this.height = 4.0;
        this.width = 1.0;
        this.length = 5.0;
    }

    public Cuboid(double height, double width, double length) {
        super();
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Cuboid(double v) {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return 2.0 * (length * width + length * height + width * height);
    }

    public double volume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuboid {");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", length=").append(length);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }
}
