/**
 * 
 */
package com.coderioter.learn.ds.linkedList;

/**
 * @author shakeels
 *
 */
public class LinkedList {

	class Node{
		private int data;
		private Node next;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	Node head;
	int size=0;;
	
	public void add(int d) {
		Node n = new Node();
		n.data = d;
		n.next=null;
		if (head == null) {
			head = n;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = n;
		}
		size++;
	}

	public void addAtBeginning(int d) {
		Node n = new Node();
		n.data=d;
		if(head!=null) 
			n.next=head;
		head=n;
		size++;
	}
	
	public void delete(int d) {
		Node currentNode = head;
		Node prevNode = null;
		while(currentNode!=null) {
			if(currentNode.data==d) {
				prevNode.next = currentNode.next;
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		size--;
	}
	
	public void reverse() {
		if(head==null) return;
		Node currentNode=head,prev=null,next=null;
		while(currentNode!=null) {
			next = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode=next;
		}
		head = prev;
	}
	
//fix this
	private void swapNodes(int i, int j) {
		if(i==j) {
			return;
		}
		if(head==null) {
			return;
		}
		Node node1=null,node2=null;
		Node currentNode = head;
		while(currentNode!=null ) {
			if(currentNode.next!=null ) {
				if(currentNode.next.data==i) {
					node1=currentNode;
				}
				if(currentNode.next.data==j) {
					node2=currentNode;
				}
			}
			if(node1!=null && node2!=null) {
				break;
			} else
			currentNode = currentNode.next;
		}
		Node nodei=null,nodej=null;

		if(node1!=null) nodei = node1.next;
		if(node2!=null) nodej = node2.next;
		
		
		Node temp = node1.next;
		node1.next = node2.next;
		node2.next = temp;
		//swap the next pointers;
		temp = nodei.next;
		nodei.next = nodej.next;
		nodej.next = temp;
	}
	
	public boolean detectLoop() {
		Node slowPointer = head, fastPointer = head;
		while(slowPointer!=null && fastPointer!=null && fastPointer.next!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer==fastPointer) {
				return true;
			}
		}
		return false;
	}
	
	public void printList() {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.print("\t"+currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public void printNElementsOfList(int i) {
		Node currentNode = head;
		while(currentNode!=null && i-->0) {
			System.out.print("\t"+currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public void rotate(int k) {
		Node currentNode = head;
		Node prevNode = null;
		while(currentNode.next!=null) {
			if(k-->0) {
				prevNode = currentNode;
			}
			currentNode = currentNode.next;
		}
		currentNode.next=head;
		head = prevNode.next;
		prevNode.next=null;
	}
	
	@Override
	public String toString() {
		Node currentNode = head;
		StringBuilder sb = new StringBuilder();
		while(currentNode!=null) {
			sb.append(Integer.toString(currentNode.data));
			currentNode = currentNode.next;
		}
		return sb.toString();
	}
	
	public int getSize() {
		return size;
		/*
		Node currentNode = head;
		int count=0;
		while(currentNode!=null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;*/
	}
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		l.add(1);
		l.printList();
		System.out.println(l.getSize());
		//l.swapNodes(7,8);
		l.reverse();
		l.printList();
		l.delete(7);
		System.out.println();
		l.printList();
		System.out.println(l.getSize());
	}

	public void printFirstThousand() {
		Node currentNode = head;
		int i = 1000;
		while(currentNode!=null && i-->0) {
			System.out.print("\t"+currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public void createLoop(int i) {
		Node currentNode = head;
		while(i-->0) {
			currentNode = currentNode.next;
		}
		Node loopStart = currentNode;
		while(currentNode!=null && currentNode.next!=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=loopStart;
	}

	public Node findLoopHead() {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return null;
		}
		Node f = head.next.next;
		Node s = head.next;
		Node p=s;
		if(s==head) {//single element list;
			return p;
		}
		if(f==head)
		{//two element list
			return s;
		}		//System.out.println("F\tS");
		while(f!=null && s!=null) {
			//System.out.println(f.data+"\t"+s.data);
			if(f.next!=null && s.next!=null && f.next==s.next) {
				break;
			}
			p=s;
			f=f.next.next;
			s=s.next;
		}
		if(s==head) {//if circular linked list
			return p;
		}
		s=head;
		while (s.next != f.next) {
			f = f.next;
			s = s.next;
		}
		return f;
	}
	
	public void removeLoopNode() {
		Node loopHead = findLoopHead();
		if(loopHead!=null && loopHead.next!=null) {
			loopHead.next=null;
		}
	}
}
