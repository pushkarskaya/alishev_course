package day18;

public class Task3 {
    public static void main(String[] args) {
//        Node node = new Node(20,
//                new Node(14,
//                        new Node(11,
//                                new Node(5,
//                                        null, new Node(8)),
//                                null),
//                        new Node(16,
//                                new Node(15),
//                                new Node(18))),
//                new Node(23,
//                        new Node(22),
//                        new Node(27,
//                                new Node(24), new Node(150))));
//        node.dfs(node);

        Node node = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers)
            Node.addNode(number, node);
        Node.dfs(node);
    }
}