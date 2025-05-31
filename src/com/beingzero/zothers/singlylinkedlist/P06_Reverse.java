package com.beingzero.zothers.singlylinkedlist;

public class P06_Reverse {
	
	static ANode reverse(ANode head)
	{
		ANode prev = null;
		ANode current = head;
		ANode next = null;
		
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		return prev;
		
	}
	
	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		sll.addLast(40);
		sll.addLast(50);
		
		System.out.println(sll);
		sll.head =  P06_Reverse.reverse(sll.head);
		
		System.out.println(sll);
		
	}

}