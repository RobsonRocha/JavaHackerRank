

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        boolean head1Finish = false;
        boolean head2Finish = false;

        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        ArrayList<Integer> arr = new ArrayList<>();

        while(!head1Finish || !head2Finish){
            if(head1 == null)
                head1Finish = true;
            if(head2 == null)
                head2Finish = true;

            if(!head1Finish){
                arr.add(head1.data);
                head1 = head1.next;
            }

            if(!head2Finish){
                arr.add(head2.data);
                head2 = head2.next;
            }
        }

        SinglyLinkedList llist1 = new SinglyLinkedList();

        arr.sort(null);

        arr.forEach(data -> {
            llist1.insertNode(data);
        });

        return llist1.head;

    }
