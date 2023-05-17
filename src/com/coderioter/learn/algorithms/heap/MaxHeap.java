/**
 * 
 */
package com.coderioter.learn.algorithms.heap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class MaxHeap {

	private int capacity;
	private int size;
	private int[] arr;

	public MaxHeap() {
		super();
		capacity = 4;
		arr = new int[capacity];
	}

	public MaxHeap(int initalCapacity) {
		super();
		capacity = initalCapacity;
		arr = new int[capacity];
	}

	public void push(int e) {
		if(size==capacity-2) {
			capacity=2*capacity;
			int[] a = new int[capacity];
			for(int i=0;i<size;i++) {
				a[i]=arr[i];
			}
			arr=a;
		}
		arr[size++] = e;
		heapify();
	}

	private void heapify() {
		int index = size - 1;
		while (arr[index] > arr[(index - 1) / 2]) {
			int temp = arr[index];
			arr[index] = arr[(index - 1) / 2];
			arr[(index - 1) / 2] = temp;
			index = (index - 1) / 2;
		}
	}

	public int getSize() {
		return size;
	}

	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public int pop() {
		if(size==0) {
			throw new RuntimeException("No elements in the queue");
		}
		int temp = arr[0];
		arr[0]=arr[size-1];
		arr[size-1]=temp;
		--size;
		int index=0;
		while((2*(index)+1<size && arr[2*(index)+1]>arr[index]) || (2*(index)<size && arr[2*(index)]>arr[index])) {
			
		}
		return arr[size];
		
	}
}
