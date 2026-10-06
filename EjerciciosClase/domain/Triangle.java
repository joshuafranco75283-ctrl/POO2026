package domain;
public class Triangle extends Rectangle {
    protected float side3;
    private float side4;
    

    public Triangle(float x, float y, Integer id, float side1, float side2, float side3) {
        super(x, y, id, side1, side2);
        setSide3(side3);
    }

    @Override 
    public void setSide3(float side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        validateSides(getSide1(), getSide2(), side3);
        this.side3 = side3;
    }
    
    public void validateSides(float side2, float side3, float side1) {
        if (side2 + side3 <= side1 || side1 + side3 <= side2 || side1 + side2 <= side3) {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side.");
        }
    }
    @Override 
    public float getSide3() {
        return side3;
    }
    @Override 
    public float getArea(){
        float s = (getSide1() + getSide2() + getSide3()) / 2;
        return (float)(Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3())));
    }
    @Override 
    public float getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }
}
