package domain;
public class Square extends Shape{
    protected double side1;
    

    public void setSide1(double side1) {
        if (side1 <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.side1 = side1;
    }
    
    public Square(Double x, Double y, Integer id , double side1){
        super(x, y, id);
        setSide1(side1);
        
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side1;
    }

    public void setSide2(double side2) {
        setSide1(side2);
    }

    public double getSide3() {
        return side1;
    }

    public void setSide3(double side3) {
        setSide1(side3);
    }

    public double getSide4() {
        return side1;
    }

    public void setSide4(double side4) {
        setSide1(side4);
    }

    @Override
    public double getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3() + getSide4();
    }

    
}
