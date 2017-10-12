/**
 *
 */
package org.techHub.creationalPatterns;

/**
 * creates object without exposing the initialization logic to client. refers newly created object through common interface.
 *
 * @author darekar
 */
public class FactoryPatternTest {

    public static void main(final String[] args) {
        ShapeFactory.getShape("Rectagle").draw();
        ShapeFactory.getShape("Circle").draw();
    }

}

class ShapeFactory {

    public static Shape getShape(final String type) {
        if (type.equals("Rectagle")) {
            return new Rectangle();
        }
        if (type.equals("Circle")) {
            return new Circle();
        }
        return null;
    }
}

abstract class Shape {

    public abstract void draw();
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}