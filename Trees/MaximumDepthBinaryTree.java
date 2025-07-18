public class MaximumDepthBinaryTree { // maxDepth or Height
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int depth(Node root) {
    if (root == null) {
      return 0;
    }

    // int lh = depth(root.left);
    // int rh = depth(root.right);
    // return Math.max(lh, rh) + 1;

    return 1 + Math.max(depth(root.left), depth(root.right));

  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(depth(root));

  }
}