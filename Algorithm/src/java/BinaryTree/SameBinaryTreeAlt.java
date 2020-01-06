package BinaryTree;

import java.util.Stack;

/**
 * Created by rbhatt22 on 12/29/19.
 */
public class SameBinaryTreeAlt {

    public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isSameTreeRecursive(p.left, q.left) && isSameTreeRecursive(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();

        stackP.push(p);
        stackQ.push(q);

        while(!stackP.isEmpty() && !stackQ.isEmpty()) {
            TreeNode tempP = stackP.pop();
            TreeNode tempQ = stackQ.pop();

            if (tempP.val != tempQ.val) {
                return false;
            }

            if (tempP.left != null && tempQ.left != null) {
                stackP.push(tempP.left);
                stackQ.push(tempQ.left);
            } else if (tempP.left == null && tempQ.left == null) {
            } else {
                return false;
            }

            if (tempP.right != null && tempQ.right != null) {
                stackP.push(tempP.right);
                stackQ.push(tempQ.right);
            } else if (tempP.right == null && tempQ.right == null) {
            } else {
                return false;
            }
        }
        if (!stackP.isEmpty() || !stackQ.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        SameBinaryTreeAlt ob = new SameBinaryTreeAlt();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(3);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(ob.isSameTreeRecursive(p, q));

        System.out.println(ob.isSameTree(p, q));
    }

}
