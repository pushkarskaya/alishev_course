package day18;

public class Node {
    private int root;
    private Node nodeLeft;
    private Node nodeRight;

    public Node(int root) {
        this.root = root;
    }

    public Node(int root, Node nodeLeft, Node nodeRight) {
        this.root = root;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;

    }

    public static void addNode(Integer number, Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Корневой узел не может быть null");
        }
        Node nodeNext = node;
        Node nodeCurrent = null;
        while (nodeNext != null) {
            nodeCurrent=nodeNext;
            if (number < nodeCurrent.getRoot()) {
                nodeNext = nodeCurrent.getNodeLeft();
            } else {
                nodeNext = nodeCurrent.getNodeRight();
            }
        }
        if (number < nodeCurrent.getRoot()) {
            nodeCurrent.setNodeLeft(new Node(number));
        } else {
            nodeCurrent.setNodeRight(new Node(number));
        }

    }

    public static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.nodeLeft);
        System.out.println(node.root);
        dfs(node.nodeRight);
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node node) {
        this.nodeLeft = node;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node node) {
        this.nodeRight = node;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

}