/**
 * 
 */
package com.coderioter.learn.algorithms.queue;

/**
 * @author shakeels
 *
 */
public class QueueUsingLinkedList<T> {

	class Node<T> {
		T data;
		Node next;
	}
	Node front;
	Node rear;
	
	public void queue(T d) {
		Node<T> n = new Node<>();
		n.data = d;
		n.next = null;
		if(front==null) {
			front = n;
			rear = n;
		}else {
			front.next=n;
			front = n;
		}
	}
	
	public void dequeue() {
		if(rear!=null) {
			rear = rear.next;
		}
	}
	
	@Override
	public String toString() {
		Node current = rear;
		StringBuilder sb = new StringBuilder();
		while(current!=null) {
			sb.append(current.data);
			current = current.next;
		}
		return sb.toString();
	}
}
