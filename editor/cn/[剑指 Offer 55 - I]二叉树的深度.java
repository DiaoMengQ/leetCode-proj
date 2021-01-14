//输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。 
//
// 例如： 
//
// 给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 10000 
// 
//
// 注意：本题与主站 104 题相同：https://leetcode-cn.com/problems/maximum-depth-of-binary-tre
//e/ 
// Related Topics 树 深度优先搜索 
// 👍 84 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
//        根结点出发，逐层遍历，访问的结点入队（先进先出 linkedList）
        LinkedList<TreeNode> nodeList = new LinkedList<>();
        // 用于树的遍历，指向树结点的指针，初始为根结点
        TreeNode cur = root;

        // 循环中止：当当前所指结点的左右子树为空，且队列中没有待访问节点
        while (!(cur.left == null && cur.right == null)) {
            // 将当前结点的左右结点加入队列
            nodeList.add(cur.left);
            nodeList.add(cur.right);
            // 获取队列的队首结点并出队
            nodeList.remove(cur = nodeList.getFirst());
            depth++;
        }

        return depth;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
