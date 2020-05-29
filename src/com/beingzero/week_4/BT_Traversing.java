package com.beingzero.week_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BT_Traversing {
	static void levelOrderTraverse(ZTreeNode root) {

		LinkedList<MyPair> queue = new LinkedList<>();
		queue.add(new MyPair(root, 0));

		Map<ZTreeNode, Integer> map = new HashMap<>();

		while (!queue.isEmpty()) {
			MyPair curr = queue.poll();

			System.out.println(curr.node.data);

			map.put(curr.node, curr.level);

			if (curr.node.left != null)
				queue.add(new MyPair(curr.node.left, curr.level + 1));

			if (curr.node.right != null)
				queue.add(new MyPair(curr.node.right, curr.level + 1));
		}
		System.out.println(map);
	}

	
	static void verticalLevelOrder(ZTreeNode root)
	{
		LinkedList<MyPair> queue = new LinkedList<MyPair>();
		queue.add(new MyPair(root, 0));
		
		Map<Integer, List<ZTreeNode>> map = new TreeMap<>();
		
		while(! queue.isEmpty())
		{
			MyPair curr = queue.poll();
			if(!map.containsKey(curr.level))
			{
				List<ZTreeNode> list = new ArrayList<>();
				list.add( curr.node);
				map.put(curr.level, list);
			}
			else
				 map.get(curr.level).add(curr.node);
			
			if (curr.node.left != null) {
				queue.add(new MyPair(curr.node.left, curr.level - 1));
			}
			if (curr.node.right != null) {
				queue.add(new MyPair(curr.node.right, curr.level + 1));
			}
		}
		for(List<ZTreeNode> nodes : map.values())
		{
			System.out.print(nodes.get(0) + " ");
		}
		
	}
	
	public static void main(String[] args) {
			ZTreeNode root = ZTreeSample.getSampleTree();
			//levelOrderTraverse(root);
			verticalLevelOrder(root);
	}
}

class MyPair {
	ZTreeNode node;
	Integer level;
	public MyPair(ZTreeNode node, Integer level) {
		this.node = node;
		this.level = level;
	}

}