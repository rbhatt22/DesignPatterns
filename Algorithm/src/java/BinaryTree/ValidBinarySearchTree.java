package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rbhatt22 on 12/29/19.
 * Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.

 Example 1:

 2
 / \
 1   3

 Input: [2,1,3]
 Output: true
 Example 2:

      5
    /   \
    1   4
        / \
       3   6

 Input: [5,1,4,null,null,3,6]
 Output: false
 Explanation: The root node's value is 5 but its right child's value is 4.

 */
public class ValidBinarySearchTree {

    public boolean isValidBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        TreeNode current = root;
        Stack<TreeNode> stackTree = new Stack<>();

        while(current != null || stackTree.size() > 0) {
            while(current != null) {
                stackTree.push(current);
                current = current.left;
            }
            current = stackTree.pop();
            if (!checkValidityAndAdd(list, current.val)) {
                return false;
            }

           current = current.right;
        }

        return true;
    }

    public boolean checkValidityAndAdd(List<Integer> list, int newValue) {
        if (list.size() == 0) {
            list.add(newValue);
            return true;
        }
        int size = list.size();
        if (list.get(size - 1) < newValue) {
            list.add(newValue);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        ValidBinarySearchTree ob = new ValidBinarySearchTree();

        TreeNode a = new TreeNode(2);
        a.left = new TreeNode(1);
        a.right = new TreeNode(3);

        TreeNode p = new TreeNode(5);
        p.left = new TreeNode(1);
        p.right = new TreeNode(4);
        p.right.left = new TreeNode(3);
        p.right.right = new TreeNode(6);

        TreeNode b = new TreeNode(5);
        b.left = new TreeNode(1);
        b.right = new TreeNode(8);
        b.left.right = new TreeNode(2);
        b.right.left = new TreeNode(6);
        b.right.right = new TreeNode(9);

        System.out.println(ob.isValidBST(a));
        System.out.println(ob.isValidBST(p));
        System.out.println(ob.isValidBST(b));

    }
}
