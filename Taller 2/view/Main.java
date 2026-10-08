package view;

import domain.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
        new Triangle(0.0f, 2.0f , 2772, 3.0f, 5.0f, 7.0f),
        new Square(2.0f, 3.0f, 3312, 4.0f),
        new Rectangle(3.0f, 5.0f, 4212, 6.0f, 7.0f),
        new Circle(5.0f, 2.0f, 2354, 6.0f),
        new Ellipse(0.0f, 3.0f, 7212, 6.0f, 4.0f),
        new Square(3.0f, 5.0f, 3227, 6.0f),   

        new Square(4.0f, 1.5f, 2034, 5.5f),
        new Square(-3.5f, 0.0f, 2088, 8.0f),
        new Square(2.2f, -4.0f, 2150, 3.2f),

        new Rectangle(1.0f, -2.5f, 3015, 8.0f, 4.5f),
        new Rectangle(-5.0f, 3.0f, 3072, 10.0f, 2.0f),
        new Rectangle(0.0f, 0.0f, 3120, 7.5f, 3.5f),

        new Circle(2.5f, 6.0f, 4011, 4.5f),
        new Circle(-1.0f, -3.0f, 4056, 7.2f),
        new Circle(6.0f, 0.5f, 4099, 2.8f),

        new Ellipse(3.0f, -1.5f, 5018, 7.0f, 3.5f),
        new Ellipse(-4.0f, 2.0f, 5064, 5.0f, 2.5f),
        new Ellipse(1.2f, 4.8f, 5102, 9.0f, 4.0f)
        };  
    
    for(int i = 0; i < shapes.length; i++){
        String nombreFigura = shapes[i].getClass().getSimpleName();
        System.out.println("---- " + nombreFigura +" Figure number "+ i +" Registrated ----");
        System.out.println("El area de la figura es " + shapes[i].getArea());
        System.out.println("El perimetro de la figura es " + shapes[i].getPerimeter());
        System.out.println("---------------");
    }
    }
}