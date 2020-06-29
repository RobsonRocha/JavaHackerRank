/*
  class Node
    int data;
    Node left;
    Node right;
*/

  public static int height(Node root) {
      // Write your code here.

      if(root == null)
          return -1;

      int right = 1 + height(root.right);
      int left = 1 + height(root.left);

      return right >= left ? right : left;

  }
