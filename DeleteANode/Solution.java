

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(head==null)
            return head;

        SinglyLinkedListNode aux = head;
        SinglyLinkedListNode ahead = head.next;

        if(ahead == null && position == 0)
            return null;
        else if (position == 0)
            return ahead;

        for( int i = 1; ahead != null; i++){
            if(i == position){
                aux.next = ahead.next;
                return head;
            }
            aux = aux.next;
            ahead = ahead.next;
        }

        return head;


    }
