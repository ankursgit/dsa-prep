package com.beingzero.week_4;


public class ZCreateSLL {
	
	static ZLLNode create(int[] arr) 
	{
		ZLLNode head = null;
		if(arr.length > 0)
		{
			head = new ZLLNode(arr[0]);
			ZLLNode prev = head;
			ZLLNode curr = null;
			for(int i = 1; i < arr.length; i++)
			{
				curr = new ZLLNode(arr[i]);
				prev.next = curr;
				prev = curr;
			}
		}
		return head;
	}
//	public static void main(String[] args) {
//		SLLNode curr = create(new int[]{1,2});
//		
//		while(curr != null)
//		{
//			System.out.print(curr.data +" ");
//			curr = curr.next;
//		}
//	}
}


