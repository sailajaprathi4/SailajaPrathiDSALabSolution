package com.gl.javafds.gradedlab3.BSTPair;
public class BSTPairMain 
{
	public static void main(String[] args) 
	{	
		test(130);
		test(70);
		test(180);
		test(150);	
		test(100);
	}
	private static void test(int sum)
	{	
		BST tree = sample1();		
		BSTPair finder= new BSTPair(tree);		
		finder.findPair(sum);		
	System.out.println("");
	}
	
	private static BST sample1() 
	{		
		BST tree = new BST();
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		return tree;
	}

}
