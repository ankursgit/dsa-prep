package com.beingzero.week_4;

public class RemoveCycle {

	static void removeCycle(ZLLNode head) 
	{
		if (head != null) 
		{
			if (head.next == head || head.next == null)
				head.next = null;
			else if(head.next.next == head || head.next.next == head.next)
				head.next.next = null;
			else 
			{
				ZLLNode fast = head, slow = head;
				boolean hasCycle = false;
				while (fast != null && fast.next != null) {
					fast = fast.next.next;
					slow = slow.next;
					if (slow == fast) {
						hasCycle = true;
						break;
					}
				}
				if(hasCycle)
				{
					slow = head;
					while (slow.next != fast.next) {
						slow = slow.next;
						fast = fast.next;
					}
					fast.next = null;
				}
				
			}
		}
	}
	public static void main(String[] args) 
	{
		ZLLNode head = new ZLLNode(1);
		ZLLNode two = new ZLLNode(2);
		ZLLNode three = new ZLLNode(3);
		ZLLNode four = new ZLLNode(4);
		
		head.next = two;
		two.next = two;
//		three.next = four;
//		four.next = three;
		
		
		removeCycle(head);
		ZLLNode curr = head;
		while(curr != null)
		{
			System.out.print(curr.data +" ");
			curr = curr.next;
		}
	}
}

