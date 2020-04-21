package com.beingzero.week_4;

public class SLL_FindMIddle 
{
	public static void main(String[] args) 
	{
		ZLLNode head = ZCreateSLL.create(new int[] {1,2,3,4,5});
		
		ZLLNode fast = head, slow = head, prevSlow = null;
		
		while(fast != null && fast.next != null)
		{
			prevSlow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast == null)
			System.out.println(prevSlow.data);
		else
			System.out.println(slow.data);
		
		
	}
}
