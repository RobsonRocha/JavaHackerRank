

    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        if(head == null)
            return head;

        DoublyLinkedListNode sorted = head;


        while(sorted.next != null && data > sorted.data){
                sorted = sorted.next;
        }

        if(data < sorted.data){
            DoublyLinkedListNode d = new DoublyLinkedListNode(data);
            if(sorted.prev != null) {
                sorted.prev.next = d;
            }
            else
                head = d;
            d.prev = sorted.prev;
            d.next = sorted;
            sorted.prev = d;
        }
        else if(data >= sorted.data){
            DoublyLinkedListNode d = new DoublyLinkedListNode(data);
            if(sorted.next != null){
                sorted.next.prev = d;
                d.next = sorted.next;
            }
            sorted.next = d;
            d.prev = sorted;
        }

        return head;

    }
