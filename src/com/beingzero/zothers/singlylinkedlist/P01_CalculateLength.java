package com.beingzero.zothers.singlylinkedlist;

public class P01_CalculateLength {

	public int calculateLength(ANode curr) {
		if (curr == null) {
			return 0;
		}
		return 1 + calculateLength(curr.next);
	}

	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(1);
		sll.addLast(2);
		sll.addLast(3);
		sll.addLast(4);
		sll.addLast(5);
		P01_CalculateLength ob = new P01_CalculateLength();
		System.out.println(ob.calculateLength(sll.head));
	}
}