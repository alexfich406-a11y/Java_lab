import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Practic1 {

    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File("info.txt"))) {
            fileScanner.useLocale(Locale.US);

            String word = fileScanner.next();   
            int mun = fileScanner.nextInt();      
            double dec = fileScanner.nextDouble();
            boolean f = fileScanner.nextBoolean(); 
            
            System.out.println("Слово: " + word);
            System.out.println("Число: " + mun);
            System.out.println("Дробное: " + dec);
            System.out.println("Флаг: " + f);
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
