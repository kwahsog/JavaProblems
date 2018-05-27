package leetcode;

import java.util.ArrayList;
import java.util.List;

/** 144. Binary Tree Preorder Traversal
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * URL: https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 * @author Alex
 *
 */

//DEFAULT PREORDER SEARCH:
/*
        if (root != null) {
            result.add(root.val); //visit(node);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
*/

//Search recursively, as need to account for null nodes (ie not well constructed binary tree);
public class Solution144LC {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recSearch(root, result);
        return result;
    }

    public static void recSearch(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            if (root.left != null) {
                recSearch(root.left, result);
            }
            if (root.right != null) {
                recSearch(root.right, result);
            }
        }
    }

    public static void main (String args[]) {
        TreeNode test = new TreeNode(1);
        test.right = new TreeNode(2);
        test.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(test).toString());

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(2);
        test2.right = new TreeNode(3);
        System.out.println(preorderTraversal(test2).toString());

    }

}
