package com.coderioter.learn.ds.graph.bfs;

public class GraphNode {
	private String value;

	public GraphNode(String v) {
		this.value = v;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value;
	}

}
