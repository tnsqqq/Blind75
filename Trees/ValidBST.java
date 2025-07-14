public class ValidBST {
  static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean isValid(Node root) {
    return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  public static boolean valid(Node root, long left, long right) {
    if (root == null) {
      return true;
    }

    if (root.data <= left || root.data >= right) {
      return false;
    }

    return valid(root.left, left, root.data) && valid(root.right, root.data, right);
  }

  public static void main(String[] args) {
    Node root = new Node(2);
    root.left = new Node(1);
    root.right = new Node(3);

    System.out.println(isValid(root));
  }
}
