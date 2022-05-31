package model;

import java.util.ArrayList;

import javafx.scene.shape.Line;

public class Edge {
	private Line id;
	private int distance;
	private ArrayList<Node> node;
	public Edge(Line id, int distance,ArrayList<Node> node) {
		this.id = id;
		this.distance = distance;
		this.setNode(node);
	}
	public Line getId() {
		return id;
	}
	public void setId(Line id) {
		this.id = id;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public ArrayList<Node> getNode() {
		return node;
	}
	public void setNode(ArrayList<Node> node) {
		this.node = node;
	}
	public void printEdge() {
		if(id!=null && node.size() != 0) {
					System.out.println(id+" "+distance+" "+node);

		}
	}
}
