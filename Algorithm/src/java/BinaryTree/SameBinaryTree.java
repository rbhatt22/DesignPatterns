package BinaryTree;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by rbhatt22 on 12/28/19.
 */
public class SameBinaryTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSame = false;

        Stack<Integer> treeStackP = new Stack<>();
        Stack<Integer> treeStackQ = new Stack<>();
        preorderTraversal(treeStackP, p);
        preorderTraversal(treeStackQ, q);

        if (treeStackP.equals(treeStackQ)) {
            isSame = true;
        }

        return isSame;
    }

    public void preorderTraversal(Stack<Integer> treeStack, TreeNode t) {
        if (t == null) {
            return;
        }

        treeStack.push(t.val);

        preorderTraversal(treeStack, t.left);

        preorderTraversal(treeStack, t.right);
    }

    public static void main(String[] args) {
        SameBinaryTree ob = new SameBinaryTree();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(ob.isSameTree(p, q));
    }
}


