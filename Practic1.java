interface Interface {
    void interfaceMethod(); 

    static class Calculator {
        public static int add(int a, int b) {
            return a + b;
        }
        
        public static int multiply(int a, int b) {
            return a * b;
        }
    }
}

class Implementation implements Interface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implemented interface method");
    }
}

public class Practic1 {
    public static void main(String[] args) {

        int sum = Interface.Calculator.add(4, 12);
        int product = Interface.Calculator.multiply(4, 12);
        
        System.out.println("4 + 12 = " + sum);
        System.out.println("4 * 12 = " + product);
        
        Implementation impl = new Implementation();
        impl.interfaceMethod();
        //impl.Calculator.add(4, 12); Ошибка
    }
}
