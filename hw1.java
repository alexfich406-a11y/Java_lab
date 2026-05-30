abstract class Shape {
    public abstract double getArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
}

public class Solution {
    
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        printArea(rect);  // Area: 50.0
        
        Square square = new Square(7);
        printArea(square);  // Area: 49.0
    }
}
