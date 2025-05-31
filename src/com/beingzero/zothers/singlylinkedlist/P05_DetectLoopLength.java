package com.beingzero.zothers.singlylinkedlist;

public class P05_DetectLoopLength {

	public static void detectLoopLength(ANode curr) {
		ANode slow = curr;
		ANode fast = curr;
		ANode ptr = null;
		boolean flag = false;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				ptr = slow;
				flag = true;
				break;
			}
		}
		if (flag) {
			slow = slow.next;
			int length = 1;
			while (slow != ptr) {
				slow = slow.next;
				length++;
			}
			System.out.println("Length - " + length);
		}
		else {
			System.out.println("LOOP NOT FOUND");
		}
	}

	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		sll.addLast(40);  
		sll.addLast(50);
		// create loop
		sll.head.next.next.next.next.next = sll.head.next;
		
		P05_DetectLoopLength.detectLoopLength(sll.head);

	}
}
