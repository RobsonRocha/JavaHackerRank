// Complete the insertNodeAtPosition function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position)                   {
    if(head == null){
        head = new  SinglyLinkedListNode(data);
        return head;
    }

    SinglyLinkedListNode tail = head;

    int i = 0;
    while(i < position-1){
        tail = tail.next;
        i++;
    }

    SinglyLinkedListNode insertedNode = new  SinglyLinkedListNode(data);
    insertedNode.next = tail.next;
    tail.next = insertedNode;

    return head;

}
