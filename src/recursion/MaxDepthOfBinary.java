package recursion;
import assistPack.TreeNode;
import javafx.util.Pair;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: balabala
 * @Date: 2019/12/30 9:34 PM
 */

public class MaxDepthOfBinary {
    // 递归
    public int maxDepth(TreeNode root){
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    //迭代
    public int maxDepthInIteration(TreeNode root){
        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                stack.add(new Pair(root.left, current_depth + 1));
                stack.add(new Pair(root.right, current_depth + 1));
            }
        }
        return depth;
    }
}
