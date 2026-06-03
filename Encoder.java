import java.io.*;

public class Encoder {

    public void compress(String input, String output) throws Exception {

        byte[] data = FileUtils.readFile(input);

        int[] freq = new int[256];

        for (byte b : data) {
            freq[b & 0xFF]++;
        }

        HuffmanTree tree = new HuffmanTree();

        Node root = tree.buildTree(freq);

        String[] codes = tree.buildCodes(root);

        StringBuilder bits = new StringBuilder();

        for (byte b : data)
            bits.append(codes[b & 0xFF]);

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(output))) {

            for (int f : freq)
                out.writeInt(f);

            out.writeUTF(bits.toString());
        }
    }
}