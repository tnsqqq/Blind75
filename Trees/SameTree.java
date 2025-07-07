public class SameTree { // isIdentical or isSubtree

  public static class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public boolean isIdentical(Node n1, Node n2) {

    if (n1 == null && n2 == null)
      return true;
    if (n1 == null || n2 == null)
      return false;

    if (n1.data != n2.data)
      return false;

    return isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right);
  }

  public boolean sameTree(Node root, Node subRoot) {
    if (root == null) {
      return false;
    }

    // if (root.data == subRoot.data) {
    // if (isIdentical(root, subRoot)) {
    // return true;
    // }
    // }

    if (isIdentical(root, subRoot))
      return true;

    // boolean left = sameTree(root.left, subRoot);
    // boolean right = sameTree(root.right, subRoot);

    // return left || right;

    return sameTree(root.left, subRoot) || sameTree(root.right, subRoot);
  }

  public static void main(String[] args) {

    SameTree tree = new SameTree();

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    Node subRoot = new Node(5);
    subRoot.left = new Node(6);
    subRoot.right = new Node(7);

    boolean result = tree.sameTree(root, subRoot);

    System.out.println(result);

  }
}

// public boolean isSameTree(TreeNode p, TreeNode q) {

// if(p == null && q == null) return true;
// if(p == null || q == null) return false;

// if(p.val != q.val) return false;

// return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
// }
