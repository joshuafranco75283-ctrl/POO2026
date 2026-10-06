package domain;

public abstract class Shape {
    private int id;
    private float  x;
    private float  y;

    public Shape(float x, float y, int id) {
        
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public abstract float getArea();
    public abstract float getPerimeter();
}