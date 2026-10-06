package domain;

public class Circle extends Shape {
    private float radius;

    public void setRadius(float radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }
    public Circle(float x, float y, int id, float radius){
        super(x, y, id);
        setRadius(radius);
    }
    public float getRadius() {
        return radius;
    }
    @Override
    public float getArea() {
        return (float)( Math.PI * radius * radius);
    }

    @Override 
    public float getPerimeter() {
        return (float) (2.0f * Math.PI * radius);
    }
}

