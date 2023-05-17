package com.coderioter.learn.algorithms.queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class QueueUsingArray<T> {
	T[] array;
	int size;
	int front = 0;
	int rear = -1;

	public QueueUsingArray() {
		array = (T[]) new Object[32];
	}

	public QueueUsingArray(int size) {
		this.size = size;
		array = (T[]) new Object[size];
	}
	
	public void enqueue(T item) {
		if(front>size-1) {
			throw new OutOfMemoryError();
		}
		else {
			array[front++] = item;
			rear = 0;
		}
	}
	
	public void dequeue() {
		if(rear==-1) {
			throw new NoSuchElementException();
		}
		array[rear++] = null;
	}
	
	public int size() {
		return front-rear;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(front>0 && size()>0) {
			for(int i=rear;i<front;i++) {
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}
}
