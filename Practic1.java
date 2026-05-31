import java.util.Formatter;

public class Practic1 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("Строка: %s%n", "Hello World");
        formatter.format("Число: %d%n", 123);
        formatter.format("Дробное: %.2f%n", 3.14159);
        formatter.format("Логическое: %b%n", true);
        formatter.format("Символ: %c%n", 'A');
        
        System.out.println(formatter);
    }
}
