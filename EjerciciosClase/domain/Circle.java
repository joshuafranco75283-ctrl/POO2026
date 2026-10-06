package domain;

public class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }
    public Circle(double x, double y, int id, double radius){
        super(x, y, id);
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

