package domain;
public class Ellipse extends Shape {
    private float semiMajorAxis;
    private float semiMinorAxis;

    public Ellipse(float x, float y, Integer id,  float semiMajorAxis, float semiMinorAxis) {
        super(x, y, id);
        setSemiMajorAxis(semiMajorAxis);
        setSemiMinorAxis(semiMinorAxis);
    }

    public void setSemiMajorAxis(float semiMajorAxis) {
        if (semiMajorAxis <= 0) {
            throw new IllegalArgumentException("Major axis must be positive.");
        }
        if (semiMajorAxis < semiMinorAxis) {
            throw new IllegalArgumentException("Major axis must be greater than or equal to minor axis.");
        }
        this.semiMajorAxis = semiMajorAxis;
    }
    
    public void setSemiMinorAxis(float semiMinorAxis) {
        if (semiMinorAxis <= 0) {
            throw new IllegalArgumentException("Minor axis must be positive.");
        }
        if (semiMinorAxis > this.semiMajorAxis) {
            throw new IllegalArgumentException("Minor axis must be less than or equal to major axis.");
        }
        this.semiMinorAxis = semiMinorAxis;
    }

    public float getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public float getSemiMinorAxis() {
        return semiMinorAxis;
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * (semiMajorAxis) * (semiMinorAxis));
    }

    @Override
    public float getPerimeter() {
        // Approximation of the perimeter of an ellipse
        return (float)((Math.PI) * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis))));
    }
    
}
