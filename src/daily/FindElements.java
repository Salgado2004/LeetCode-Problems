/* Problem 1261 */
package daily;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class FindElements {
    TreeNode tree;

    public FindElements(TreeNode root) {
        recoverTree(0, root);
        this.tree = root;
    }

    public void recoverTree(int val, TreeNode root){
        root.val = val;
        if (root.left != null)
            recoverTree(2 * val + 1, root.left);
        if (root.right != null)
            recoverTree(2 * val + 2, root.right);
    }

    public boolean find(int target) {
        if (this.tree == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.tree);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.val == target) {
                return true;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return false;
    }
}
