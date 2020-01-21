package com.singlylinkedlist;

public class P07_Palindrome {

	static void checkPalindrome(ANode curr)
	{
		ANode prev_slow = curr;
		ANode slow = curr;
		ANode fast = curr;
		ANode middleNode = null;
		ANode second_half = null;
		ANode lastNode = null;
		boolean isPalin = true;
		/*
		 * Get the middle of the list. Move slow_ptr by 1 and fast_ptrr by 2, slow_ptr
		 * will have the middle node
		 */
		while (fast != null && fast.next != null) {
			prev_slow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		/*
		 * ODD LIST
		 * 		FAST != NULL
		 * 		Middle Node = slow
		 * 
		 * EVEN LIST
		 * 		FAST == NULL
		 */
		if(fast != null)
		{
			middleNode = slow;
			slow = slow.next;
		}
		prev_slow = null;
		second_half = slow;
		lastNode = reverse(middleNode);
		System.out.println(lastNode.next.next.data);
		
		//COMPARE NODES FOR PALINDROME
		while(curr.data == lastNode.data) {
			if(curr.data != lastNode.data) {
				isPalin = false;;
				break;
			}
			lastNode = lastNode.next;
			curr = curr.next;
		}
		if(isPalin)
			System.out.println("LIST IS PALINDROME");
		
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
