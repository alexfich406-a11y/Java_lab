import java.util.StringJoiner;

public class Practic2 {
    public static void main(String[] args) {
        StringJoiner fruits = new StringJoiner(", ");
        fruits.add("Cube");
        fruits.add("Circle");
        fruits.add("Triangle");
        System.out.println(fruits.toString()); // Cube, Circle, Triangle
        
        StringJoiner names = new StringJoiner(" | ", "[ ", " ]");
        names.add("Yellow");
        names.add("Blue");
        names.add("Red");
        System.out.println(names.toString()); // [ Yellow | Blue | Red ]
    }
}
