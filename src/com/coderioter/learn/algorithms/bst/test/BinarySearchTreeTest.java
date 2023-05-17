/**
 * 
 */
package com.coderioter.learn.algorithms.bst.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.coderioter.learn.algorithms.bst.BinarySearchTree;

/**
 * @author shakeels
 *
 */
public class BinarySearchTreeTest {

	private BinarySearchTree b;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		b = new BinarySearchTree();
		b.addNode(5);
		b.addNode(1);
		b.addNode(4);
		b.addNode(3);
		b.addNode(7);
		b.addNode(8);
		b.addNode(2);
		b.addNode(6);
		b.addNode(9);
	}

	/**
	 * Test method for {@link com.coderioter.learn.algorithms.bst.BinarySearchTree#height()}.
	 */
	@Test
	public void testHeight() {
		System.out.println(b.height());
	}

}
