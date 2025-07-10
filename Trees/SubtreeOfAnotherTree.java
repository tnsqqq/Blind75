public class SubtreeOfAnotherTree {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean isIdentical(Node root, Node subRoot) {
    if (root == null && subRoot == null) {
      return true;
    }

    if (root == null || subRoot == null) {
      return false;
    }

    if (root.data != subRoot.data) {
      return false;
    }

    return isIdentical(root.left, subRoot.left) && isIdentical(root.right,
        subRoot.right);
  }

  public static boolean subTree(Node root, Node subRoot) {
    if (root == null) {
      return false;
    }

    if (root.data == subRoot.data) {
      if (isIdentical(root, subRoot)) {
        return true;
      }
    }

    boolean left = subTree(root.left, subRoot);
    boolean right = subTree(root.right, subRoot);

    return left || right;
  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    Node subRoot = new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);

    System.out.println(subTree(root, subRoot));

  }
}

// class Solution {
// public boolean isSubtree(TreeNode root, TreeNode subRoot) {
// if (root == null) return false;
// if (isSameTree(root, subRoot)) return true;
// return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
// }

// private boolean isSameTree(TreeNode s, TreeNode t) {
// if (s == null && t == null) return true;
// if (s == null || t == null) return false;
// if (s.val != t.val) return false;

// return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
// }
// }
