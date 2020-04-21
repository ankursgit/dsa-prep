package com.beingzero.week_4;

public class SLL_RearrangeLL {

	public static void main(String[] args) {
		ZLLNode head = ZCreateSLL.create(new int[] { 1 });

		frontLastRearrange(null);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	static void frontLastRearrange(ZLLNode head) {
		if (head != null && head.next != null) 
		{

			ZLLNode mid = findMid(head);
			ZLLNode halfHead = mid.next;
			mid.next = null;

			// 1 2 3
			// 6 5 4

			ZLLNode front = head;
			ZLLNode back = reverseLL(halfHead);
			ZLLNode newHead = null;

			ZLLNode next = null, backNext = null;
			while (back != null) {
				next = front.next;
				backNext = back.next;

				front.next = back;
				back.next = null;

				if (front == head) {
					newHead = front;
					newHead = newHead.next;
				} else {
					newHead.next = front;
					newHead = newHead.next.next;
				}

				front = next;
				back = backNext;
			}
			if (front != null) {
				newHead.next = front;
				newHead.next.next = null;
			}
		}
	}

	static ZLLNode reverseLL(ZLLNode head) {
		if (head == null || head.next == null)
			return head;

		ZLLNode newHead = reverseLL(head.next);

		head.next.next = head;
		head.next = null;

		return newHead;
	}

	static ZLLNode findMid(ZLLNode head) {
		ZLLNode slow = head, fast = head, prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast == null)
			return prev;
		return slow;
	}
}
