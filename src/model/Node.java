package model;

import java.util.ArrayList;

import javafx.scene.shape.Circle;

public class Node {

	private ArrayList<Edge> edge;
	private Circle name;
	public Node(ArrayList<Edge> edge, Circle name) {
		this.edge = edge;
		this.name = name;
	}
	public ArrayList<Edge> getEdge() {
		return edge;
	}
	public void setEdge(ArrayList<Edge> edge) {
		this.edge = edge;
	}
	public Circle getName() {
		return name;
	}
	public void setName(Circle name) {
		this.name = name;
	}
	public String showName() {
		// TODO Auto-generated method stub
		return name.toString();
	}
	
}
