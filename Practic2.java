import java.io.*;

public class Practic2 {

    public static void main(String[] args) {
         ByteArrayOutputStream output = new ByteArrayOutputStream();

        output.write(18);   
        output.write(81);  
        output.write(222);  
        output.write(108);  
        output.write(123);  
        output.write(35);   
        
        System.out.println(output.toString());
    }
}
