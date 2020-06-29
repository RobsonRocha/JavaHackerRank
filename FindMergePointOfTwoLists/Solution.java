

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        List<SinglyLinkedListNode>list=new ArrayList<SinglyLinkedListNode>();

        while(temp1!=null){
            list.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(list.contains(temp2)){
                break;
            }
            temp2=temp2.next;
        }
        return temp2.data;

    }
