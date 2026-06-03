import java.util.PriorityQueue;

public class HuffmanTree {

    private final String[] codes = new String[256];

    public Node buildTree(int[] freq) {

        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {
                pq.add(new Node((byte)i, freq[i]));
            }
        }

        if (pq.isEmpty())
            return null;

        if (pq.size() == 1) {
            Node only = pq.poll();
            return new Node(only, new Node((byte)0, 0));
        }

        while (pq.size() > 1) {

            Node left = pq.poll();
            Node right = pq.poll();

            pq.add(new Node(left, right));
        }

        return pq.poll();
    }

    public String[] buildCodes(Node root) {
        buildCodesRecursive(root, "");
        return codes;
    }

    private void buildCodesRecursive(
            Node node,
            String code
    ) {

        if (node.isLeaf()) {
            if (code.isEmpty())
                code = "0";
        
            codes[node.symbol & 0xFF] = code;
            return;
        }

        buildCodesRecursive(node.left, code + "0");
        buildCodesRecursive(node.right, code + "1");
    }
}