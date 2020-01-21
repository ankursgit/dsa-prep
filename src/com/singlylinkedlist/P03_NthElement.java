package com.singlylinkedlist;

import java.util.Scanner;

public class P03_NthElement {

	// Nth Element from Front
	public void frontNthElement(ANode curr, int n) {
		boolean flag = true;
		while (n-- > 1) {
			if (curr != null)
				curr = curr.next;
			else {
				System.out.println("INVALID NUMBER");
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Number - " + curr.data);
	}

	
	/*
	 * Nth Element from Back
	 * 
	 * (N) from back = (Length - N + 1) from front
	 */
	public void backNthElement(ANode curr, int n)
	{
		int length = getLength(curr);
		
		if(n <= length && n > 1) {
			int frontPos = length - n + 1;
			frontNthElement(curr, frontPos);
		}
		else
			System.out.println("INVALID");
		
		
	}
	
	
	// calculate length
	public int getLength(ANode curr) {
		if (curr == null)
			return 0;
		return 1 + getLength(curr.next);
	}

	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		sll.addLast(40);
		sll.addLast(50);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		P03_NthElement obj = new P03_NthElement();
		//obj.frontNthElement(sll.head, n);
		
		obj.backNthElement(sll.head, n);
	}
}
