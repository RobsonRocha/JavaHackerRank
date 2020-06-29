

	/*

    class Node
    	int data;
    	Node left;
    	Node right;
	*/
	public static void visit (Queue<Node> queue){
        if(queue.isEmpty())
            return;

        Node n = queue.poll();

        if(n != null) {
            System.out.print(n.data + " ");
            queue.add(n.left);
            queue.add(n.right);
        }
        visit(queue);
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        visit(q);

    }
