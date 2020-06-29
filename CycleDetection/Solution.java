

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        Map<SinglyLinkedListNode, Integer> map = new HashMap<SinglyLinkedListNode,Integer>();

        if(head == null || head.next == null)
          return false;

        SinglyLinkedListNode aux = head;

        map.put(aux,1);

        aux = aux.next;

        while(aux != null){
            boolean visited = map.get(aux) != null;
            if(visited)
                return true;
            else
              map.put(aux,1);
            aux = aux.next;
        }

        return false;

    }
