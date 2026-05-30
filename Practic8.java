interface Figure {
    double area();
}

class Rectangle implements Figure {
    double a, b;
    Rectangle(double a, double b) { this.a = a; this.b = b; }
    public double area() { return a * b; }
}

public class Practic8 {

    public static void main(String[] args) {
        var rec = new Rectangle(5, 10);
        double s = rec.area(); 
    }
}
