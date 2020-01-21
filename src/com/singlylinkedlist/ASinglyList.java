package com.singlylinkedlist;

public class ASinglyList {
	public ANode head;

	public void addFirst(int data) {
		ANode node = new ANode(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void addAtPos(int data, int position) {
		ANode node = new ANode(data);
		if (head == null) {
			head = node;
		} 
		else if (position == 1) {
			addFirst(data);
		} 
		else {
			ANode curr = head;
			int i = position - 1;
			for (; i > 1 && curr != null; i--) {
				curr = curr.next;
			}
			if (i == 1) {
				ANode temp = curr.next;
				curr.next = node;
				node.next = temp;
			} else {
				System.out.println("Invalid Position");
			}
		}
	}

	public void addLast(int data) {
		ANode curr = head;
		if(curr == null)
		{
			addFirst(data);
		}
		else {
			while(curr.next != null)
			{
				curr = curr.next;
			}
			curr.next = new ANode(data);
		}
	}

	public void deleteFirst(int data) {

	}

	public void deleteAtPos(int data, int position) {

	}

	public void deleteLast(int data) {

	}

	@Override
	public String toString() {
		String buff = new String();
		ANode curr = head;
		buff = buff.concat("List : ");
		while (curr != null) {
			buff = buff.concat(curr.data + "   ");
			curr = curr.next;
		}
		return buff;
	}

}