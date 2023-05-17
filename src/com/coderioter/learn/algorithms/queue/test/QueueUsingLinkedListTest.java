/**
 * 
 */
package com.coderioter.learn.algorithms.queue.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.coderioter.learn.algorithms.queue.QueueUsingLinkedList;

/**
 * @author shakeels
 *
 */
public class QueueUsingLinkedListTest {

	private QueueUsingLinkedList<Integer> queue;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		queue = new QueueUsingLinkedList<>();
		queue.queue(5);
		queue.queue(7);
		queue.queue(8);
		queue.queue(4);
		queue.queue(3);
		queue.queue(0);
		queue.queue(1);
	}

	/**
	 * Test method for {@link com.coderioter.learn.algorithms.queue.QueueUsingLinkedList#queue(java.lang.Object)}.
	 */
	@Test
	public void testQueue() {
		assertEquals("5784301", queue.toString());
	}

	/**
	 * Test method for {@link com.coderioter.learn.algorithms.queue.QueueUsingLinkedList#dequeue()}.
	 */
	@Test
	public void testDequeue() {
		queue.dequeue();
		assertEquals("784301", queue.toString());
	}

}
