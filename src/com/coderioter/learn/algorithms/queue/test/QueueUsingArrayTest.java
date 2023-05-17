package com.coderioter.learn.algorithms.queue.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.coderioter.learn.algorithms.queue.QueueUsingArray;

public class QueueUsingArrayTest {

	QueueUsingArray<Integer> queue;
	@Before
	public void setup() {
		queue = new QueueUsingArray<>(10);
		queue.enqueue(5);
		queue.enqueue(9);
		queue.enqueue(4);
		queue.enqueue(8);
		queue.enqueue(2);
		queue.enqueue(6);
		queue.enqueue(1);
		queue.enqueue(7);
	}
	
	@Test
	public void testEnqueue() {
		String expected = "59482617";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testSize() {
		assertEquals(8, queue.size());
	}
	@Test
	public void testDequeue() {
		queue.dequeue();
		assertEquals("9482617", queue.toString());
	}

}
