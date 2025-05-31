package com.beingzero.zothers.singlylinkedlist;

public class P04_DetectLoop {

	public static void detectLoop(ANode curr)
	{
		ANode slow = curr;
		ANode fast = curr;
		boolean found = false;
		
		while(fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("LOOP FOUND");
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println("LOOP NOT FOUND");
	}
	
	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		sll.addLast(40);
		sll.addLast(50);
		//create loop
		sll.head.next.next.next.next.next = sll.head.next;
		
		P04_DetectLoop.detectLoop(sll.head);
		
	}
}
