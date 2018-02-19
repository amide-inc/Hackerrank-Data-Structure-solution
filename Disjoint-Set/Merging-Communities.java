import java.io.*;
import java.util.*;

public class Solution {
   private Map<Integer, Node> map = new HashMap<>();
	public static void main(String[] args) {
		Solution ds = new Solution();
	   Scanner in = new Scanner(System.in);
	   int p = in.nextInt();
	   int n = in.nextInt();
	   for(int i=1;i<=p;i++) {
		   ds.makeSet(i);
	   }
	   String[] res = new String[n+1];
	   for(int i=0;i<n+1;i++) {
		   res[i] = in.nextLine();
	   }
	for(int i=0;i<=n;i++) {
		String aa[] = res[i].split(" ");
		if(aa[0].equals("Q")) {
			ds.getSize(Integer.parseInt(aa[1]));
		}else if(aa[0].equals("M")) {
			ds.union(Integer.parseInt(aa[1]), Integer.parseInt(aa[2]));
		}
	}
		

	}
	class Node {
		int data;
		Node parent;
		int rank;
		int Size;
	}
   public void makeSet(int data) {
	   Node node = new Node();
	   node.data = data;
	   node.parent = node;
	   node.rank = 0;
	   node.Size = 1;
	   map.put(data,  node);
	   
   }
   public boolean union(int data1, int data2) {
	   Node node1 = map.get(data1);
	   Node node2 = map.get(data2);
	   Node parent1 = findSet(node1);
	   Node parent2 = findSet(node2);
	   if(parent1.data == parent2.data) {
		   return false;
	   }
	  
	   if(parent1.rank>= parent2.rank) {
		   parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
		   parent2.parent = parent1;
           parent1.Size += parent2.Size;
	   }else {
		   parent1.parent = parent2;
           parent2.Size += parent1.Size;
	   }
	   return true;
   }
private Node findSet(Node node) {
	Node parent = node.parent;
	if(parent == node) {
		return parent;
	}
	node.parent = findSet(node.parent);
	return node.parent;
}
private void getSize(int data) {
	Node node = findSet(map.get(data));
	
	System.out.println(node.Size);
}

}  
