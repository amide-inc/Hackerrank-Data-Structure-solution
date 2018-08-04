    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode pichhe = null;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode aage = null;
        while(current != null){
            aage = current.next;
            current.next = pichhe;
            pichhe = current;
            current =  aage;
        }
        head = pichhe;
        return  head;
    }
