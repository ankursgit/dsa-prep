package com.beingzero.week_4;

public class ZTreeNode 
{
	int data;
	ZTreeNode left;
	ZTreeNode right;
	public ZTreeNode(int data) {
		this.data = data;
	}
	public ZTreeNode() {
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(this.data);
	}
}
