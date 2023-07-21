package DZ4;

public class Main {
    public static void main(String[] args) {
        RedBlackTree<Integer> tree = new RedBlackTree<>();
        tree.add(7);
        tree.add(4);
        tree.add(5);
        tree.add(12);
        tree.add(17);
        tree.add(208);
        tree.add(19);
        tree.add(202);
        tree.add(199);
        tree.print();
    }
}