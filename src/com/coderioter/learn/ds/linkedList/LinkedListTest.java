/**
 * 
 */
package com.coderioter.learn.ds.linkedList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author shakeels
 *
 */
public class LinkedListTest {

	LinkedList l;

	@Before
	public void setup() {
		l = new LinkedList();
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(1);
	
	}
	
	@Test
	public void testAdd() {
		assertTrue(l.toString().equals("345789101"));
	}

	@Test
	public void insertAtBeginning() {
		l.addAtBeginning(99);
		assertTrue(l.toString().equals("99345789101"));
	}
	@Test
	public void testSize() {
		assertEquals(8, l.getSize());
	}

	@Test
	public void testDelete() {
		l.delete(7);
		assertEquals(7, l.getSize());
		assertEquals("34589101", l.toString());
	}	

	@Test
	public void testReverse() {
		l.reverse();
		assertEquals("110987543", l.toString());
	}
	
	@Test
	public void testDetectLoop() {
		assertFalse(l.detectLoop());
		//create loop
		LinkedList.Node n = l.head;
		LinkedList.Node loopPoint=null;
		int i=3;
		while(n.getNext()!=null ) {
			if(i--==0) {
				loopPoint=n;
			}
			n = n.getNext();
		}
		n.setNext(loopPoint);
		
		assertTrue(l.detectLoop());
	}
	
	@Test//new
	public void testRemoveLoop() {
		l.createLoop(3);
		l.removeLoopNode();
		assertTrue(l.toString().equals("345789101"));
	}
	@Test
	public void testCircularLoop() {
		l.createLoop(0);
		System.out.println(l.findLoopHead().getData());
		l.removeLoopNode();
		//l.printNElementsOfList(100);
		assertTrue(l.toString().equals("345789101"));
	}
	
	@Test
	public void testRotate() {
		l.rotate(3);
		assertEquals("789101345", l.toString());
	}
}
