import java.io.*;
public class Practic4 {
    public static void main(String[] args) {
        FileOutputStream file1 = null;
        try {
            file1 = new FileOutputStream("test.txt");
            file1.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file1 != null) file1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        try (FileOutputStream file2 = new FileOutputStream("test2.txt")) {
            file2.write(66);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
