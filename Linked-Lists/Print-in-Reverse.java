    static void reversePrint(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        if(head != null) {
           String ss = head.data+"";
            
           while(temp.next != null){
                temp = temp.next;
                ss = temp.data+"\n"+ss;
            }
            System.out.print(ss);
            System.out.print("\n");
        }

    }
