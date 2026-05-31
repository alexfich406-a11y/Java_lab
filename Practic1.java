import java.util.Formatter;
import java.util.Date;

public class Practic1 {
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
    public static void main(String[] args) {
         try {
            int[] numbers = {1, 2, 3};
            System.out.println("Обращаемся к элементу массива: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
        
        System.out.println("\nПример с неперехваченным исключением: ");
        
        int[] numbers = {1, 2, 3};
        System.out.println("Обращаемся к элементу массива: " + numbers[5]);
    }
}
