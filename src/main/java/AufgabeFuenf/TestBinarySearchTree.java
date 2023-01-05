package AufgabeFuenf;

public class TestBinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree treeOne = createByArray(new double[]{50.0, 25.0, 75.0, 12.5, 87.5, 37.5, 62.5});
        BinarySearchTree treeTwo = createByArray(new double[]{12.5, 25.0, 37.5, 50.0, 62.5, 75.0, 87.5});
        System.out.println(treeOne.getDepth());
        System.out.println(treeTwo.getDepth());
    }

    public static BinarySearchTree createByArray(double[] input) {
        BinarySearchTree tree = new BinarySearchTree();
        for (double j : input) {
            tree.add(j);
        }
        return tree;
    }
}
