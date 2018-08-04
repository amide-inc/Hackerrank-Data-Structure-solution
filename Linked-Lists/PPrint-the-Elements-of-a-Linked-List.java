static void printLinkedList(SinglyLinkedListNode head) {
              if(head != null) {
                  System.out.println(head.data);
                  SinglyLinkedListNode temp = head.next;
                  while(temp.next != null){
                      System.out.println(temp.data);
                      temp = temp.next;
                  }
                  System.out.println(temp.data);
                  
              }

  }
