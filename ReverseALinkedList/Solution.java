

    // Complete the reverse function below.



    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        Stack<Integer> rev = new Stack<>();
        SinglyLinkedList llist = new SinglyLinkedList();

        while(head != null){
            rev.push(head.data);
            head = head.next;
        }

        Integer data = rev.pop();
        llist.insertNode(data);

        while(!rev.isEmpty()){
            data = rev.pop();
            llist.insertNode(data);
        }

        return llist.head;

    }
