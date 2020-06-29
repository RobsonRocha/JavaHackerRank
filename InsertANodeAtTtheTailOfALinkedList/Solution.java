// Complete the insertNodeAtTail function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

    if(head == null){
        SinglyLinkedListNode next = new SinglyLinkedListNode(data);
        head = next;
    }
    else{
        SinglyLinkedListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = new SinglyLinkedListNode(data);
    }
    return head;

}
