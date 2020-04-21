package com.beingzero.week_4;

public class SLL_ReverseLL 
{
	public static void main(String[] args) 
	{
		ZLLNode head = ZCreateSLL.create(new int[] {1,2,3,4,5});
		
		//head = recursiveReverse(head);
		head = threePointerReversal(head);
		
		while(head != null)
		{
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
	static ZLLNode recursiveReverse(ZLLNode head)
	{
		//NO NODE  ||  ONE NODE / LAST NODE
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ZLLNode newHead = recursiveReverse(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
	static ZLLNode threePointerReversal(ZLLNode head)
	{
		ZLLNode prev = null, curr = head, next = null;
		while( curr != null )
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
