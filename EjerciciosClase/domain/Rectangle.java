package domain;
public class Rectangle extends Square {
    protected double side2;

    public Rectangle(Double x, Double y, Integer id, double side1, double side2) {
        super(x, y, id, side1);
        setSide2(side2);
    }
    public void setSide2(double side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.side2 = side2;
    }
    @Override 
    public double getSide2() {
        return side2;
    }
    @Override 
    public double getSide3() {
        return side1;
    }
    @Override 
    public void setSide3(double side3) {
        setSide1(side3);
    }
    @Override 
    public double getSide4() {
        return side2;
    }
    @Override 
    public void setSide4(double side4) {
        setSide2(side4);
    }
    @Override
    public double getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getSide1() + getSide2());
    }
    
}
