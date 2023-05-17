package com.coderioter.learn.ds.graph.bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {
	private Map<GraphNode, List<GraphNode>> m;

	public Graph() {
		m = new HashMap<>();
	}

	public void addEdge(GraphNode f, GraphNode t) {
		if (!m.containsKey(f)) {
			m.put(f, new ArrayList<GraphNode>());
		}
		List<GraphNode> l = m.get(f);
		l.add(t);
	}

	public void addEdge(GraphNode f, GraphNode t, boolean undirected) {
		addEdge(f, t);
		if (undirected) {
			addEdge(t, f);
		}
	}
//BFS Traversal
	public List<String> bfs(GraphNode s) {
		List<String> result = new ArrayList<>();
		Queue<GraphNode> q = new LinkedList<>();
		Set<GraphNode> visited = new HashSet<>();
		q.add(s);
		visited.add(s);
		while (!q.isEmpty()) {
			GraphNode g = q.remove();
			result.add(g.getValue());
			if (m.containsKey(g)) {
				List<GraphNode> l = m.get(g);
				for (GraphNode x : l) {
					if (!visited.contains(x)) {
						q.add(x);
						visited.add(x);
					}
				}
			}
		}
		return result;
	}

//DFS traversal
	public List<String> dfs(GraphNode b) {
		return dfs(b, new HashSet<GraphNode>(), new ArrayList<String>());
	}
	
	private List<String> dfs(GraphNode b, HashSet<GraphNode> visited, ArrayList<String> result) {
		if (visited.contains(b)) {
			return result;
		}
		
		visited.add(b);
		result.add(b.toString());
		if(!m.containsKey(b)) {
			return result;
		}
		for(GraphNode node: m.get(b)) {
			dfs(node,visited,result);
		}
		return result;
	}
	
	//topological sort using DFS
	public List<String> topologicalSortDfs(GraphNode b) {
		List<String> topologicalSortDfs = topologicalSortDfs(b, new HashSet<GraphNode>(), new ArrayList<String>());
		Collections.reverse(topologicalSortDfs);
		return topologicalSortDfs;
	}
	
	private List<String> topologicalSortDfs(GraphNode b, HashSet<GraphNode> visited, ArrayList<String> result) {
		visited.add(b);
		if(!m.containsKey(b)) {
			result.add(b.toString());
			return result;
		}
		for(GraphNode node: m.get(b)) {
			if(!visited.contains(node))
				topologicalSortDfs(node,visited,result);
		}
		result.add(b.toString());
		return result;
	}
	public List<String> topologicalSort(GraphNode root){
		
		List<String> result = new ArrayList<>();
		Queue<GraphNode> q = new LinkedList<>();
		return null;
	}
}
