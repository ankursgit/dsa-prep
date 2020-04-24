package com.beingzero.week_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BT_LeftViewOfTree 
{
	public static void main(String[] args) {
		ZTreeNode root = ZTreeSample.getSampleTree();
		leftView(root);
	}
	static void leftView(ZTreeNode root)
	{
		LinkedList<MyPair> queue = new LinkedList<MyPair>();
		List<ZTreeNode> leftViewNodes = new ArrayList<ZTreeNode>();
		
		int maxLevel = 0;
		queue.add(new MyPair(root, maxLevel));
		leftViewNodes.add(root);
		
		while(!queue.isEmpty())
		{
			MyPair currPair = queue.pop();
			
			if(currPair.node.left != null)
			{
				if(maxLevel < currPair.level+1)
				{
					maxLevel = currPair.level+1;
					leftViewNodes.add(currPair.node.left);
				}
				queue.add(new MyPair(currPair.node.left, maxLevel));
			}
			if(currPair.node.right != null)
			{
				if(maxLevel < currPair.level+1)
				{
					maxLevel = currPair.level+1;
					leftViewNodes.add(currPair.node.right);
				}
				queue.add(new MyPair(currPair.node.right, maxLevel));
			}
		}
		System.out.println(leftViewNodes);
	}
}

