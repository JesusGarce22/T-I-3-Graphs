package model;

import java.util.ArrayList;

public class Edge {
	private String id;
	private int distance;
	private ArrayList<Node> node;
	public Edge(String id, int distance,ArrayList<Node> node) {
		this.id = id;
		this.distance = distance;
		this.setNode(node);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
}
