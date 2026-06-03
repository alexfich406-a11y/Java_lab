import java.io.*;

public class FileUtils {

    public static byte[] readFile(String path) throws IOException 
    {
        try (FileInputStream fi = new FileInputStream(path)) {
            return fi.readAllBytes();
        }
    }

    public static void writeFile(String path, byte[] data) throws IOException
    {
    
        try (FileOutputStream fo = new FileOutputStream(path)) {
            fo.write(data);
        }
    }
}