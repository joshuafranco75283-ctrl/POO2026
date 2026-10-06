package domain;

public abstract class Shape {
    private int id;
    private double x;
    private double y;

    public Shape(double x, double y, int id) {
        
        this.x = x;
        this.y = y;
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive integer.");
        }
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}