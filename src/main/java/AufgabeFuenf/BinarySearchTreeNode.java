package AufgabeFuenf;

public class BinarySearchTreeNode {

    private BinarySearchTreeNode leftNode;
    private BinarySearchTreeNode rightNode;
    private final double value;

    public BinarySearchTreeNode(double value) {
        this.value = value;
    }


    public void add(double newValue) {
        if (newValue < value) {
            if (leftNode == null) {
                leftNode = new BinarySearchTreeNode(newValue);
            } else {
                leftNode.add(newValue);
            }
        } else {
            if (rightNode == null) {
                rightNode = new BinarySearchTreeNode(newValue);
            } else {
                rightNode.add(newValue);
            }
        }
    }

    public int getDepth() {
        int leftDepth = (leftNode  == null) ? 0 : leftNode.getDepth();
        int rightDepth = (rightNode == null) ? 0 : rightNode.getDepth();
        return 1 + Math.max(leftDepth, rightDepth);
    }



}
