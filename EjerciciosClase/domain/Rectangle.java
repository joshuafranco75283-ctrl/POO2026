package domain;
public class Rectangle extends Square {
    protected float side2;

    public Rectangle(float x, float y, Integer id, float side1, float side2) {
        super(x, y, id, side1);
        setSide2(side2);
    }
    public void setSide2(float side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.side2 = side2;
    }
    @Override 
    public float getSide2() {
        return side2;
    }
    @Override 
    public float getSide3() {
        return side1;
    }
    @Override 
    public void setSide3(float side3) {
        setSide1(side3);
    }
    @Override 
    public float getSide4() {
        return side2;
    }
    @Override 
    public void setSide4(float side4) {
        setSide2(side4);
    }
    @Override
    public float getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public float getPerimeter() {
        return 2 * (getSide1() + getSide2());
    }
    
}
