package model;

import java.util.ArrayList;

import javafx.scene.shape.Circle;

public class Node {

	private ArrayList<Edge> edge;
	private Circle node;
	public Node(ArrayList<Edge> edge, Circle node) {
		this.edge = edge;
		this.node = node;
	}
	public ArrayList<Edge> getEdge() {
		return edge;
	}
	public void setEdge(ArrayList<Edge> edge) {
		this.edge = edge;
	}
	public Circle getNode() {
		return node;
	}
	public void setNode(Circle node) {
		this.node = node;
	}

	
}
