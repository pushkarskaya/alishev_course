package day18;

public class Node {
    int root;
    Node nodeLeft;
    Node nodeRight;

    public Node(int root) {
        this.root = root;
    }

    public Node(int root, Node nodeLeft, Node nodeRight) {
        this.root = root;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;

    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.nodeLeft);
        System.out.println(node.root);
        dfs(node.nodeRight);
    }

}