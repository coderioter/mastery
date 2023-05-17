package com.coderioter.learn.ds.graph.bfs;

import java.util.List;

public class Main {

	public static void main(String[] args) {
//		directedBFS();
//		System.out.println("\n------------");
//		undirectedBFS();
//		System.out.println("\n------------");
//		directedDFS();
//		System.out.println("\n------------");
//		unDirectedDFS();
		System.out.println("\n------------");
		topologicalSortDFS();
	}

	private static void unDirectedDFS() {
		GraphNode a = new GraphNode("A");
		GraphNode b = new GraphNode("B");
		GraphNode c = new GraphNode("C");
		GraphNode d = new GraphNode("D");
		GraphNode e = new GraphNode("E");
		GraphNode f = new GraphNode("F");
		GraphNode g = new GraphNode("G");
		GraphNode h = new GraphNode("H");
		GraphNode i = new GraphNode("I");
		GraphNode j = new GraphNode("J");
		Graph unDirectedGraph = new Graph();
		boolean undirected = true;
		unDirectedGraph.addEdge(a, i, undirected);
		unDirectedGraph.addEdge(a, f, undirected);
		unDirectedGraph.addEdge(a, c, undirected);
		unDirectedGraph.addEdge(a, b, undirected);

		unDirectedGraph.addEdge(c, e, undirected);
		unDirectedGraph.addEdge(c, d, undirected);

		unDirectedGraph.addEdge(b, g, undirected);
		unDirectedGraph.addEdge(b, h, undirected);
		unDirectedGraph.addEdge(b, j, undirected);

		System.out.println("Un-Directed Graph DFT from B");
		List<String> bfsUndirected = unDirectedGraph.dfs(b);
		for (String v : bfsUndirected) {
			System.out.print(" " + v);
		}
		System.out.println();
		System.out.println("Un-Directed Graph DFT from A");
		bfsUndirected = unDirectedGraph.dfs(a);
		for (String v : bfsUndirected) {
			System.out.print(" " + v);
		}
		
	}

	private static void directedDFS() {
		GraphNode a = new GraphNode("A");
		GraphNode b = new GraphNode("B");
		GraphNode c = new GraphNode("C");
		GraphNode d = new GraphNode("D");
		GraphNode e = new GraphNode("E");
		GraphNode f = new GraphNode("F");
		GraphNode g = new GraphNode("G");
		GraphNode h = new GraphNode("H");
		GraphNode i = new GraphNode("I");
		GraphNode j = new GraphNode("J");

		Graph directedGraph = new Graph();
		directedGraph.addEdge(a, i);
		directedGraph.addEdge(a, f);
		directedGraph.addEdge(a, c);
		directedGraph.addEdge(a, b);

		directedGraph.addEdge(c, e);
		directedGraph.addEdge(c, d);

		directedGraph.addEdge(b, g);
		directedGraph.addEdge(b, h);
		directedGraph.addEdge(b, j);

		System.out.println("DirectedGraph DFT from "+b.getValue());
		List<String> dfs = directedGraph.dfs(b);
		for (String v : dfs) {
			System.out.print(" " + v);
		}
		
	}
	private static void topologicalSort() {
		GraphNode a = new GraphNode("A");
		GraphNode b = new GraphNode("B");
		GraphNode c = new GraphNode("C");
		GraphNode d = new GraphNode("D");
		GraphNode e = new GraphNode("E");
		GraphNode f = new GraphNode("F");
		GraphNode g = new GraphNode("G");
		GraphNode h = new GraphNode("H");
		GraphNode i = new GraphNode("I");
		GraphNode j = new GraphNode("J");
		
		Graph directedGraph = new Graph();
		directedGraph.addEdge(a, i);
		directedGraph.addEdge(a, f);
		directedGraph.addEdge(a, c);
		directedGraph.addEdge(a, b);
		
		directedGraph.addEdge(c, e);
		directedGraph.addEdge(c, d);
		
		directedGraph.addEdge(b, g);
		directedGraph.addEdge(b, h);
		directedGraph.addEdge(b, j);
		
		System.out.println("DirectedGraph DFT from "+a.getValue());
		List<String> dfs = directedGraph.topologicalSort(a);
		for (String v : dfs) {
			System.out.print(" " + v);
		}
		
	}
	private static void topologicalSortDFS() {
		GraphNode a = new GraphNode("A");
		GraphNode b = new GraphNode("B");
		GraphNode c = new GraphNode("C");
		GraphNode d = new GraphNode("D");
		GraphNode e = new GraphNode("E");
		GraphNode f = new GraphNode("F");
		GraphNode g = new GraphNode("G");
		GraphNode h = new GraphNode("H");
		GraphNode i = new GraphNode("I");
		GraphNode j = new GraphNode("J");
		
		Graph directedGraph = new Graph();
		directedGraph.addEdge(a, i);
		directedGraph.addEdge(a, f);
		directedGraph.addEdge(a, c);
		directedGraph.addEdge(a, b);
		
		directedGraph.addEdge(c, e);
		directedGraph.addEdge(c, d);
		
		directedGraph.addEdge(b, g);
		directedGraph.addEdge(b, h);
		directedGraph.addEdge(b, j);
		
		System.out.println("DirectedGraph DFT from "+a.getValue());
		List<String> dfs = directedGraph.topologicalSortDfs(a);
		for (String v : dfs) {
			System.out.print(" " + v);
		}
		Graph d2 = new Graph();
		d2.addEdge(a, b);
		d2.addEdge(b, d);
		d2.addEdge(d, c);
		d2.addEdge(d, e);
		d2.addEdge(e, f);
		d2.addEdge(f, h);
		d2.addEdge(h, g);
		System.out.println("Topological Sort using DFS "+a.getValue());
		List<String> dfs2 = d2.topologicalSortDfs(a);
		for (String v : dfs2) {
			System.out.print(" " + v);
		}
	}

	private static void undirectedBFS() {
		GraphNode a = new GraphNode("A");
		GraphNode b = new GraphNode("B");
		GraphNode c = new GraphNode("C");
		GraphNode d = new GraphNode("D");
		GraphNode e = new GraphNode("E");
		GraphNode f = new GraphNode("F");
		GraphNode g = new GraphNode("G");
		GraphNode h = new GraphNode("H");
		GraphNode i = new GraphNode("I");
		GraphNode j = new GraphNode("J");
		Graph unDirectedGraph = new Graph();
		boolean undirected = true;
		unDirectedGraph.addEdge(a, i, undirected);
		unDirectedGraph.addEdge(a, f, undirected);
		unDirectedGraph.addEdge(a, c, undirected);
		unDirectedGraph.addEdge(a, b, undirected);

		unDirectedGraph.addEdge(c, e, undirected);
		unDirectedGraph.addEdge(c, d, undirected);

		unDirectedGraph.addEdge(b, g, undirected);
		unDirectedGraph.addEdge(b, h, undirected);
		unDirectedGraph.addEdge(b, j, undirected);

		System.out.println("Un-Directed Graph BFT from "+b.getValue());
		List<String> bfsUndirected = unDirectedGraph.bfs(b);
		for (String v : bfsUndirected) {
			System.out.print(" " + v);
		}
		System.err.println();
		System.out.println("Un-Directed Graph BFT from "+a.getValue());
		bfsUndirected = unDirectedGraph.bfs(a);
		for (String v : bfsUndirected) {
			System.out.print(" " + v);
		}
	}

	private static void directedBFS() {
		GraphNode a = new GraphNode("A");
		GraphNode b = new GraphNode("B");
		GraphNode c = new GraphNode("C");
		GraphNode d = new GraphNode("D");
		GraphNode e = new GraphNode("E");
		GraphNode f = new GraphNode("F");
		GraphNode g = new GraphNode("G");
		GraphNode h = new GraphNode("H");
		GraphNode i = new GraphNode("I");
		GraphNode j = new GraphNode("J");

		Graph directedGraph = new Graph();
		directedGraph.addEdge(a, i);
		directedGraph.addEdge(a, f);
		directedGraph.addEdge(a, c);
		directedGraph.addEdge(a, b);

		directedGraph.addEdge(c, e);
		directedGraph.addEdge(c, d);

		directedGraph.addEdge(b, g);
		directedGraph.addEdge(b, h);
		directedGraph.addEdge(b, j);

		System.out.println("DirectedGraph BFT from "+b.getValue());
		for (String v : directedGraph.bfs(b)) {
			System.out.print(" " + v);
		}
	}
}
