package domain;
public class Square extends Shape{
    protected float side1;
    

    public void setSide1(float side1) {
        if (side1 <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.side1 = side1;
    }
    
    public Square(float x, float y, Integer id , float side1){
        super(x, y, id);
        setSide1(side1);
        
    }
    public float getSide1() {
        return side1;
    }
    public float getSide2() {
        return side1;
    }

    public void setSide2(float side2) {
        setSide1(side2);
    }

    public float getSide3() {
        return side1;
    }

    public void setSide3(float side3) {
        setSide1(side3);
    }

    public float getSide4() {
        return side1;
    }

    public void setSide4(float side4) {
        setSide1(side4);
    }

    @Override
    public float getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public float getPerimeter() {
        return getSide1() + getSide2() + getSide3() + getSide4();
    }

    
}
