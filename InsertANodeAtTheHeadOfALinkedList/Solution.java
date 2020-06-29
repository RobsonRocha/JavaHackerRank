// Complete the insertNodeAtHead function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

    SinglyLinkedListNode head = new SinglyLinkedListNode(data);
    if(llist == null){
        llist = head;
    }
    else{
        head.next = llist;
    }

    return head;

}
