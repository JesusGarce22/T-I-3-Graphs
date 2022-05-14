package model;

import java.util.ArrayList;

public class Node {

	private ArrayList<Edge> edge;
	private String name;
	private String direction;
	public Node(ArrayList<Edge> edge, String name,String direction) {
		this.edge = edge;
		this.name = name;
		this.direction= direction;
	}
	public ArrayList<Edge> getEdge() {
		return edge;
	}
	public void setEdge(ArrayList<Edge> edge) {
		this.edge = edge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
}
