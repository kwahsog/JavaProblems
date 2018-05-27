package leetcode;

import java.util.ArrayList;
import java.util.List;

/** 145. Binary Tree Postorder Traversal
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * URL: https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 * @author Alex
 *
 */

//DEFAULT POSTORDER SEARCH:
/*
        if (root != null) {
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            result.add(root.val); //visit(node);
        }
*/

//Search recursively, as need to account for null nodes (ie not well constructed binary tree);
public class Solution145LC {

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recSearch(root, result);
        return result;
    }

    public static void recSearch(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                recSearch(root.left, result);
            }
            if (root.right != null) {
                recSearch(root.right, result);
            }
            result.add(root.val);
        }
    }

    public static void main (String args[]) {
        TreeNode test = new TreeNode(1);
        test.right = new TreeNode(2);
        test.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(test).toString());

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(4);
        test2.left.left = new TreeNode(10);
        test2.left.right = new TreeNode(11);
        test2.right = new TreeNode(3);
        System.out.println(postorderTraversal(test2).toString());

    }

}
