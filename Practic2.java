import java.util.StringJoiner;

public class Practic2 {
    public static void main(String[] args) {
        System.out.println("Преобразования: ");
        
        //String -> StringBuilder
        String str = "Привет";
        StringBuilder sb = new StringBuilder(str);
        sb.append(" мир!");
        System.out.println("String -> StringBuilder: " + sb);
        
        // String -> StringBuffer  
        StringBuffer buffer = new StringBuffer(str);
        buffer.append(" все!");
        System.out.println("String -> StringBuffer: " + buffer);
        
        // StringBuilder -> String
        StringBuilder sb2 = new StringBuilder("Java");
        String result1 = sb2.toString();
        System.out.println("StringBuilder -> String: " + result1);
        
        //StringBuffer -> String
        StringBuffer buffer2 = new StringBuffer("Programming");
        String result2 = buffer2.toString();
        System.out.println("StringBuffer -> String: " + result2);
        
        //StringBuilder -> StringBuffer (через String)
        StringBuilder sb3 = new StringBuilder("Hello");
        String temp = sb3.toString();
        StringBuffer buffer3 = new StringBuffer(temp);
        System.out.println("StringBuilder -> StringBuffer: " + buffer3);
        
        //StringBuffer -> StringBuilder (через String)
        StringBuffer buffer4 = new StringBuffer("World");
        String temp2 = buffer4.toString();
        StringBuilder sb4 = new StringBuilder(temp2);
        System.out.println("StringBuffer -> StringBuilder: " + sb4);
    }
}
