static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
          SinglyLinkedListNode node = new SinglyLinkedListNode(data);
         SinglyLinkedListNode temp = head;
          for(int i=0;i<position-1;i++){
              temp = temp.next;
          }
         SinglyLinkedListNode temp1 = temp.next;
         temp.next = node;
         node.next = temp1;
        return head;

    }
