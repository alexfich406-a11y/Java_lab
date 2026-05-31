import java.util.Formatter;
import java.util.Date;

public class Practic1 {
    static class AgeValidationException extends Exception {
        private final int enteredAge;

        public AgeValidationException() {
            super("Ошибка валидации возраста");
            this.enteredAge = 0;
        }

        public AgeValidationException(String message) {
            super(message);
            this.enteredAge = 0;
        }

        public AgeValidationException(String message, int age) {
            super(message);
            this.enteredAge = age;
        }

        public int getEnteredAge() {
            return enteredAge;
        }
}
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 0) {
            throw new AgeValidationException("Возраст не может быть отрицательным", age);
        }
        if (age > 150) {
            throw new AgeValidationException("Возраст слишком большой", age);
        }
        System.out.println("Возраст корректен: " + age);

    public static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-5);  // Появиться исключение
        } catch (AgeValidationException e) {
            System.out.println("Поймано AgeValidationException: " + e.getMessage() + ", с возрастом: " + e.getEnteredAge());
        }
    }
}
