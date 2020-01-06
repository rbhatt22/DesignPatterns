package BinaryTree;

/**
 * Created by rbhatt22 on 12/28/19.
 */
public class BinaryTree {

    //Root of Binary Tree
    Node root;

    BinaryTree(int  key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.root = new Node(1);
        /**
         *          1
         *         / \
         *      null  null
         */

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        /**
         *          1
         *         / \
         *       2    3
         *      / \  / \
         *   null null null
         */

        bt.root.left.left = new Node(4);
        /**
         *          1
         *         / \
         *       2    3
         *      / \  / \
         *     4 null null
         *    / \
         * null null
         */

    }

}
