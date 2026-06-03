import java.io.*;

public class Decoder {

    public void decompress(String input, String output) throws Exception 
    {

        try (DataInputStream in = new DataInputStream(new FileInputStream(input))) {

            int[] freq = new int[256];
            for (int i = 0; i < 256; i++) {
                freq[i] = in.readInt();
            }

            HuffmanTree tree = new HuffmanTree();

            Node root = tree.buildTree(freq);

            if (root == null) {
                FileUtils.writeFile(output, new byte[0]);
                return;
            }

            String bits = in.readUTF();
            ByteArrayOutputStream result = new ByteArrayOutputStream();

            Node current = root;

            for (int i = 0; i < bits.length(); i++) {
                current = bits.charAt(i) == '0' ? current.left : current.right;

                if (current.isLeaf()) 
                {
                    result.write(current.symbol);
                    current = root;
                }
            }

            FileUtils.writeFile(
                    output,
                    result.toByteArray()
            );
        }
    }
}