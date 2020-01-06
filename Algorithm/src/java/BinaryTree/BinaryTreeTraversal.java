package BinaryTree;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by rbhatt22 on 12/29/19.
 *
 */
public class BinaryTreeTraversal {

    public void preorderTraversalRecursive(Stack<Integer> preorderStack, TreeNode t) {

        if (t == null) {
            return;
        }

        preorderStack.push(t.val);
        preorderTraversalRecursive(preorderStack, t.left);
        preorderTraversalRecursive(preorderStack, t.right);
    }

    public void inorderTraversalRecursive(Stack<Integer> inorderStack, TreeNode t) {
        if (t == null) {
            return;
        }

        inorderTraversalRecursive(inorderStack, t.left);
        inorderStack.push(t.val);
        inorderTraversalRecursive(inorderStack, t.right);
    }

    public void postorderTraversalRecursive(Stack<Integer> postorderStack, TreeNode t) {
        if (t == null) {
            return;
        }

        postorderTraversalRecursive(postorderStack, t.left);
        postorderTraversalRecursive(postorderStack, t.right);
        postorderStack.push(t.val);
    }

    public void inorderTraversal(Stack<Integer> inorderStack, TreeNode t) {
        if (t == null) {
            return;
        }

        Stack<TreeNode> temp = new Stack<>();
        TreeNode current = t;

        while(current != null || temp.size() > 0) {

            //If current node is not null the go to left child
            while(current != null) {
                temp.push(current);
                current = current.left;
            }
            current = temp.pop();
            inorderStack.push(current.val);

            current = current.right;
        }
    }

    public void preorderTraversal(Stack<Integer> preorderStack, TreeNode t) {
        if (t == null) {
            return;
        }

        Stack<TreeNode> temp = new Stack<>();
        TreeNode current = t;

        while(current != null || temp.size() > 0) {

            while(current != null) {
                preorderStack.push(current.val);
                temp.push(current);
                current = current.left;
            }
            current = temp.pop().right;
        }
    }

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right.left = new TreeNode(6);
        p.right.right = new TreeNode(7);

        BinaryTreeTraversal ob = new BinaryTreeTraversal();

        System.out.println("Pre Order Traversal");
        Stack<Integer> preorderStackR = new Stack<>();
        ob.preorderTraversalRecursive(preorderStackR, p);
        System.out.println(Arrays.toString(preorderStackR.toArray()));

        System.out.println("In Order Traversal");
        Stack<Integer> inorderStackR = new Stack<>();
        ob.inorderTraversalRecursive(inorderStackR, p);
        System.out.println(Arrays.toString(inorderStackR.toArray()));

        System.out.println("Post Order Traversal");
        Stack<Integer> postorderStackR = new Stack<>();
        ob.postorderTraversalRecursive(postorderStackR, p);
        System.out.println(Arrays.toString(postorderStackR.toArray()));

        System.out.println("In Order Traversal without recursion");
        Stack<Integer> inorderStack = new Stack<>();
        ob.inorderTraversal(inorderStack, p);
        System.out.println(Arrays.toString(inorderStack.toArray()));

        System.out.println("Pre Order Traversal without recursion");
        Stack<Integer> preorderStack = new Stack<>();
        ob.preorderTraversal(preorderStack, p);
        System.out.println(Arrays.toString(preorderStack.toArray()));
    }

}
