package leetcode;

import leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 94. Binary Tree Inorder Traversal
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * URL: https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * @author Alex
 *
 */

//DEFAULT INORDER SEARCH:
/*
        if (root != null) {
            inorderTraversal(root.left);
            result.add(root.val); //visit(node);
            inorderTraversal(root.right);
        }
*/

//Search recursively, as need to account for null nodes (ie not well constructed binary tree);
public class Solution94LC {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recSearch(root, result);
        return result;
    }

    public static void recSearch(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                recSearch(root.left, result);
            }
            result.add(root.val);
            if (root.right != null) {
                recSearch(root.right, result);
            }
        }
    }

    public static void main (String args[]) {
        TreeNode test = new TreeNode(1);
        test.right = new TreeNode(2);
        test.right.right = new TreeNode(3);
        System.out.println(inorderTraversal(test).toString());

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(2);
        test2.right = new TreeNode(3);
        System.out.println(inorderTraversal(test2).toString());

    }

}
