class Printer {
    void print(int... nums) {
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
    }

    void print(String... strs) {
        for (String s : strs) System.out.print(s + " ");
        System.out.println();
    }
}

public class Practic1 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println("Печать чисел:");
        printer.print(1, 2, 3);
        printer.print(10, 20, 30, 40, 50);

        System.out.println("\nПечать строк:");
        printer.print("Hello", "World");
        printer.print("Java", "is", "good");
    }
}
