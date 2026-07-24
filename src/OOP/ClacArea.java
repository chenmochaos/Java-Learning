package OOP;

public class ClacArea {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(),
                new Rectangle()
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
            totalArea += shape.calculateArea();
        }
        System.out.println("总面积: " + totalArea);
    }
}

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius = 2;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length = 5.0;
    private double width = 3.0;

    double calculateArea() {
        return length * width;
    }
}