package domain;
public class Triangle extends Rectangle {
    protected double side3;
    private double side4;
    

    public Triangle(Double x, Double y, Integer id, double side1, double side2, double side3) {
        super(x, y, id, side1, side2);
        setSide3(side3);
    }

    @Override 
    public void setSide3(double side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        validateSides(getSide1(), getSide2(), side3);
        this.side3 = side3;
    }
    
    public void validateSides(double side2, double side3, double side1) {
        if (side2 + side3 <= side1 || side1 + side3 <= side2 || side1 + side2 <= side3) {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side.");
        }
    }
    @Override 
    public double getSide3() {
        return side3;
    }
    @Override 
    public double getArea(){
        double s = (getSide1() + getSide2() + getSide3()) / 2;
        return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
    }
    @Override 
    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }
}
