package com.singlylinkedlist;

public class P02_SeachANumber {

	public static boolean searchNumber(ANode curr, int x) {

		if (curr == null)
			return false;

		if (curr.data == x)
			return true;

		return searchNumber(curr.next, x);
	}

	public static void main(String[] args) {
		ASinglyList sll = new ASinglyList();
		sll.addLast(10);
		sll.addLast(20);
		sll.addLast(30);
		sll.addLast(40);
		sll.addLast(50);
		sll.addLast(60);

		System.out.println(P02_SeachANumber.searchNumber(null, 100));
	}
}