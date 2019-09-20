import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int deep = 0;
        while (queue.size() > 0) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode ele = queue.poll();
                if (ele.left != null) {
                    queue.offer(ele.left);
                }
                if (ele.right != null) {
                    queue.offer(ele.right);
                }
            }

            deep++;
        }
        return deep;

    }

    public static void main(String args[]){
        int[] nums={0,2,4,1,0,3,-1,5,1,0,6,0,8};
        TreeNode head=new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(head);
        int i=1;
        while (!queue.isEmpty()){
            TreeNode treeNode=queue.poll();
            TreeNode left=new TreeNode(nums[i]);
            treeNode.left=left;
            queue.offer(treeNode.left);
            i++;
            if(i>=nums.length){
                break;
            }
            TreeNode right=new TreeNode(nums[i]);
            treeNode.right=right;
            queue.offer(treeNode.right);
            i++;
            if(i>=nums.length){
                break;
            }

        }

        System.out.println(maxDepth(head));
    }
}
