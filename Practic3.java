import java.util.StringJoiner;
public class Practic3 {
    public static void main(String[] args) {
        String prevText = "Banana,\n" +
                        "Apple,\n" +
                        "Orange, tomato";

        String curText = """
                Banana,
                Apple,  
                Orange, tomato""";
        
        System.out.println(" предыдущий текст:");
        System.out.println(prevText);
        System.out.println(" текущий текст:");
        System.out.println(curText);
    }
}
