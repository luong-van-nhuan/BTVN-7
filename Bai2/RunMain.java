package Bai2;

import java.util.function.Predicate;

public class RunMain {
    public static void main(String[] args) {
        IShape[] iShapes = new IShape[3];
        iShapes [0] = new Rectangle(3.4,5.3);
        iShapes [1] = new Circle(5.5);
        iShapes [2] = new Rectangle(7.3,3.4);
        for(int i = 0; i < 3; i++){
            System.out.println("Area of shapes[" + i +"]:" + iShapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i +"]:" + iShapes[i].getPerimeter());

        }
    }
}
