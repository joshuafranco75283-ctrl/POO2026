package domain;
public class Ellipse extends Shape {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(Double x, Double y, Integer id,  double semiMajorAxis, double semiMinorAxis) {
        super(x, y, id);
        setSemiMajorAxis(semiMajorAxis);
        setSemiMinorAxis(semiMinorAxis);
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        if (semiMajorAxis <= 0) {
            throw new IllegalArgumentException("Major axis must be positive.");
        }
        if (semiMajorAxis < semiMinorAxis) {
            throw new IllegalArgumentException("Major axis must be greater than or equal to minor axis.");
        }
        this.semiMajorAxis = semiMajorAxis;
    }
    
    public void setSemiMinorAxis(double semiMinorAxis) {
        if (semiMinorAxis <= 0) {
            throw new IllegalArgumentException("Minor axis must be positive.");
        }
        if (semiMinorAxis > semiMajorAxis) {
            throw new IllegalArgumentException("Minor axis must be less than or equal to major axis.");
        }
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * (semiMajorAxis) * (semiMinorAxis);
    }

    @Override
    public double getPerimeter() {
        // Approximation of the perimeter of an ellipse
        return (Math.PI) * (3 * (semiMajorAxis + semiMinorAxis) - Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }
    
}
