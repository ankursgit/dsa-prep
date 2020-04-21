package com.beingzero.week_4;

public class SLL_AlternateLL {

	class LLNode {
		int data;
		LLNode next;

		LLNode(int d) {
			data = d;
			next = null;
		}
	}

	LLNode alternateMerge(LLNode h1, LLNode h2) {
		LLNode h = h1;
		if (h1 != null && h2 != null) {
			
			LLNode head = null;
			LLNode h1Next = null, h2Next = null;
			while (h1 != null && h2 != null) {
				h1Next = h1.next;
				h2Next = h2.next;

				h1.next = h2;
				h2.next = null;

				if (head == null) {
					head = h1;
					head = head.next;
				} else {
					head.next = h1;
					head = head.next.next;
				}
				h1 = h1Next;
				h2 = h2Next;
			}
			while (h1 != null) {
				head.next = h1;
				head = head.next;
				h1 = h1.next;
			}
			while (h2 != null) {
				head.next = h2;
				head = head.next;
				h2 = h2.next;
			}
		} else {
			return (h1 == null) ? h2 : h1;
		}
		return h;
	}

}
