import java.util.Formatter;
import java.util.Date;

public class Practic1 {
    static class Exception2 extends RuntimeException {
        public Exception2(String message) {
            super(message);
        }
    }

    static class Exception3 extends Exception2 {
        public Exception3(String message) {
            super(message);
        }
    }
    public static void someMethod1(int value) {
        if (value == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Отрицательное значение");
        }
    }
    
    public static void someMethod2(int value) {
        if (value < -10) {
            throw new Exception3("Очень специфическая ошибка");
        } else if (value < 0) {
            throw new Exception2("Общая ошибка данных");
        }
    }
    public static void main(String[] args) {
        System.out.println("Ситуация 1: Одинаковая обработка разных исключений: ");
        
        try {
            someMethod1(0);
        } catch (ArithmeticException | IllegalArgumentException e) {

            System.out.println("Ошибка в вычислениях: " + e.getMessage());
        }
        
        System.out.println("\nСитуация 2: Иерархия исключений: ");
        
        try {
            someMethod2(-1);
        } catch (RuntimeException e) { //Можно поменять на Exception2
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
