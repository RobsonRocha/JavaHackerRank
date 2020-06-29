

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        if(head == null)
            return head;

        DoublyLinkedListNode inverted = null;

        while(head != null){
            DoublyLinkedListNode dn = new DoublyLinkedListNode(head.data);

            if(inverted == null){
                inverted = dn;

            }
            else{
                inverted.prev = dn;
                dn.next = inverted;
                inverted = dn;
            }
            head = head.next;

        }

        return inverted;

    }
