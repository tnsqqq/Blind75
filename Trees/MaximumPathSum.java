public class MaximumPathSum { // sum of nodes

  public static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int sum(Node root) {
    if (root == null) {
      return 0;
    }

    int ls = sum(root.left);
    int rs = sum(root.right);

    return ls + rs + root.data;
  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(sum(root));

  }
}

// class Solution {
// int maxSum = Integer.MIN_VALUE;

// private int helper(TreeNode node){
// if(node == null) return 0;

// int left = Math.max(0, helper(node.left));
// int right = Math.max(0, helper(node.right));

// int pathSum = left + right + node.val;

// maxSum = Math.max(maxSum, pathSum);

// return node.val + Math.max(left, right);
// }

// public int maxPathSum(TreeNode root) {
// helper(root);
// return maxSum;

// }
// }
