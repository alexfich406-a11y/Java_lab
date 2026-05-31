class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Practic1 {
    public static void main(String[] args) {
        Wrapper<Integer> wInt = new Wrapper<>(42);
        Wrapper<String> wStr = new Wrapper<>("Hello");
        Wrapper<Double> wDouble = new Wrapper<>(3.14);
        if (wInt instanceof Wrapper) {
            System.out.println("wInt является экземпляром Wrapper");
        }

        if (wStr instanceof Wrapper<?>) {
            System.out.println("wStr является экземпляром Wrapper<?>");
        }
        
        Object valInt = wInt.getValue();
        Object valStr = wStr.getValue();
        Object valDouble = wDouble.getValue();

        if (valInt instanceof Integer) {
            System.out.println("Внутри wInt лежит Integer: " + valInt);
        }

        if (valStr instanceof String) {
            System.out.println("Внутри wStr лежит String: " + valStr);
        }

        if (valDouble instanceof Double) {
            System.out.println("Внутри wDouble лежит Double: " + valDouble);
        }

    }
}
