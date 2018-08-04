    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
         SinglyLinkedListNode node = new SinglyLinkedListNode(data);
         if(llist == null){
             llist = node;
         }else{
             SinglyLinkedListNode temp = llist;
             node.next = temp;
             llist = node;
         }
        return llist;

    }
