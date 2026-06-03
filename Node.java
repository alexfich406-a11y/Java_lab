public class Node implements Comparable<Node> {

    public byte symbol;
    public int freq;
    public Node left;
    public Node right;

    public Node(byte symbol, int freq) {
        this.symbol = symbol;
        this.freq = freq;
    }

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
        this.freq = left.freq + right.freq;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(freq, other.freq);
    }
}
