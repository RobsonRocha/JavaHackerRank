

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        Stack<Integer> stack = new Stack<>();

        while(head != null){
            stack.push(head.data);
            head = head.next;
        }

        int result=-1;

        for(int i = positionFromTail; i >=0; i--){
            result =  stack.pop();
        }

        return result;

    }
