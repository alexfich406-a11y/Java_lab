class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Practic1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3)); 
        System.out.println(calc.add(1, 2, 3)); 
        System.out.println(calc.add(1.5, 2.5)); 
        System.out.println(calc.add("Hello ", "World"));
    }
}
