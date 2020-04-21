package com.singlylinkedlist;

public class P07_Palindrome {

	static void checkPalindrome(ANode curr)
	{
		ANode slowPtr = curr;
		ANode fastPtr = curr;
		ANode secondHalfHead = null;
		ANode middleNode = null;
		ANode prevToMiddle = null;
		
		// Get the middle of the list.
		// 1 2 2 1 5
		while (fastPtr != null && fastPtr.next != null) {
			prevToMiddle = slowPtr;
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		/*
		 * ODD LIST :: FAST != NULL --> Middle Node = slow 
		 * EVEN LIST :: FAST == NULL
		 */

		if (fastPtr != null) {
			middleNode = slowPtr;
			slowPtr = slowPtr.next;
		}
		secondHalfHead = slowPtr;
		
		//Reverse Second Half
		secondHalfHead = reverse(secondHalfHead);
		
		
		// Compare the list
		ANode front = curr;
		ANode back = secondHalfHead;
		System.out.println(compareNodes(front, back));
		
		// Restore SLL
		System.out.println(prevToMiddle.data);
		secondHalfHead = reverse(secondHalfHead);
		
		middleNode.next = secondHalfHead;
		
	}

	static ANode reverse(ANode curr) {
		ANode prev = null;
		ANode current = curr;
		ANode next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;

	}
	
	static boolean compareNodes(ANode front, ANode back) {
		while (front != null && back != null) {
			if (front.data == back.data) {
				front = front.next;
				back = back.next;
			} else
				return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		//sll.addLast(40);
		sll.addLast(30);
		sll.addLast(20);
		sll.addLast(10);

		System.out.println(sll);
		P07_Palindrome.checkPalindrome(sll.head);

		System.out.println(sll);

	}
}
