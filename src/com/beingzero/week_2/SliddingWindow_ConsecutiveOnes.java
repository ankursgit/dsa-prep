package com.beingzero.week_2;

/*
 * Given an array A of size N of 0's and 1's, we may change up to K values from 0 to 1.
 */
public class SliddingWindow_ConsecutiveOnes 
{
	public static void main(String[] args) 
	{
		int[] arr = { 0, 0, 0, 1, 1};
		//int[] arr = {};
		
		int allowedConversions = 2;
		int start = 0, end = 0, converted = 0, maxCount = Integer.MIN_VALUE;
		boolean flag = false;
		
		while(end < arr.length)
		{
			if(arr[end] == 1) 
			{
				maxCount = Math.max(maxCount, (end-start+1));
				flag = true;
			}
			else 
			{
				if(converted < allowedConversions)
				{
					converted++;
					maxCount = Math.max(maxCount, (end-start+1));
					flag = true;
				}
				else 
				{
					while(converted != 0)
					{
						if(arr[start] == 0)
							converted--;
						if(start < end-1)
						start++;
					}
				}
			}
			end++;
		}
		if(flag)
			System.out.println(maxCount);
		else
			System.out.println(0);
	}
}
