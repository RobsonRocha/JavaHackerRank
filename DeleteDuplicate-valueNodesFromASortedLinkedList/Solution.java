

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode aux = head;


        if(head == null)
            return null;

        if(head.next == null)
            return head;

        SinglyLinkedListNode ahead = head.next;

        while(ahead != null){
            if(aux.data == ahead.data){
                aux.next = ahead.next;
                ahead = ahead.next;
            }
            else{
                aux = aux.next;
                ahead = ahead.next;
            }
        }

        return head;

    }
