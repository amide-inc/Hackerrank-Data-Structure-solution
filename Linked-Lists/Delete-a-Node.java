    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp = head;
        if(position != 0){
        for(int i=0;i<position-1;i++)
            temp = temp.next;
        
        SinglyLinkedListNode temp1 = temp.next;
        temp.next = temp1.next;
        }else{
            head =  temp.next;
        }
        return head;

    }
