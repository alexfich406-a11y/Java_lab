import java.util.Formatter;
import java.util.Date;

public class Practic3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Date curDate = new Date();
        formatter.format("Час: %tH%n", curDate);
        formatter.format("Минуты: %tM%n", curDate);
        formatter.format("Год: %tY%n", curDate);
        formatter.format("Месяц: %tB%n", curDate);
        formatter.format("День недели: %tA%n", curDate);
        System.out.println(formatter);
    }
}
