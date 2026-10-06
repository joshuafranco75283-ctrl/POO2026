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
        new Square(3.0f, 5.0f, 3227, 6.0f)   
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