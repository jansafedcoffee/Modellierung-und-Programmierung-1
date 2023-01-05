package AufgabeFuenf;

public class BinarySearchTree {
    private BinarySearchTreeNode root;

    public void add(double value) {
        if (root == null) {
            root = new BinarySearchTreeNode(value);
        } else {
            root.add(value);
        }
    }

    public int getDepth() {
        return (root == null) ? 0 : root.getDepth();
    }

}

