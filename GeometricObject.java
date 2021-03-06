// Program: GeometricObject.java
// Written by: Michael Roffo

import java.awt.Graphics;
import java.awt.Color;

public abstract class GeometricObject extends Shape {
    // fields:
    private Color color;
    private boolean filled = false;
    private int xPos, yPos;

    // constructors:
    public GeometricObject() {
        super();
        this.color = Color.WHITE;
        this.filled = false;
    }

    public GeometricObject(Color color, boolean filled) {
        super();
        this.color = color;
        this.filled = filled;
    }

    // set and get:
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean isFilled) {
        this.filled = isFilled;
    }

    public abstract void draw(Graphics g);

    // toString() states date of creation:
    @Override
    public String toString() {
        return String.format("created on %s");
    }

    // abstracts and overrides:
    @Override
    public abstract String getName();
    @Override
    public abstract double getArea();
    @Override
    public abstract double getPerimeter();
    public abstract double getRadius();
}