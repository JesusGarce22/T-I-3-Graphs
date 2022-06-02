package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import ui.MainWindows;

public class Graph<T> {

	private static ArrayList<Line> edge= new ArrayList<>();;
	private static ArrayList<Circle> node = new ArrayList<>();
	private static ArrayList<Node> enlace;
	private static Circle temp;
	public Graph() {
		temp=null;
	}

	public void findWay(String userName,String then,String destin,ArrayList<Node> vertex ) {
		System.out.println(userName+" Quiere ir de: "+then+" a "+destin);	
	//	System.out.println(vertex);
		enlace=vertex;
		for(int i=0;i<vertex.size();i++) {
			if(vertex.get(i)!=null && vertex.get(i).getNode().getId().equalsIgnoreCase(then)) {
				System.out.println(then+ " "+vertex.get(i).getNode().getId());
				temp=vertex.get(i).getNode();
				node.add(vertex.get(i).getNode());
				caminoMinimo(vertex.get(i),destin);
			}
		}

	}

	public void caminoMinimo(Node aux,String des) {
		
		Edge next=null;
		//Condicion de parada
		for(int i=1;i<node.size();i++) {
			if(node.get(i).getId().equalsIgnoreCase(des)) {
				System.out.println(" llegamos a "+node.get(i).getId());
				MainWindows m=MainWindows.getInstance();
				System.out.println(node+ " "+ edge.size()+" ");
				try {
					
					m.showInTheMap();	
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			}
		}

		ArrayList<Integer> xx=new ArrayList<>();
		for(int i=0;i<aux.getEdge().size();i++) {
			xx.add(aux.getEdge().get(i).getDistance());
			int min=Collections.min(xx);
			if(aux.getEdge().get(i)!=null && min==aux.getEdge().get(i).getDistance()) {
				Line line=aux.getEdge().get(i).getId();
				edge.add(line);
				//System.out.println(line.getId()+" Distancia minima "+min);
				next=aux.getEdge().get(i);

			}

		}

		if(next!=null) {
			for(int j=0;j<next.getNode().size();j++) {

				T t=(T) next.getNode().get(j);
				Circle g=(Circle) t;
				//System.out.println(g);
				if(g!=temp) {
					for(int y=0;y<enlace.size();y++) {
						if(enlace.get(y).getNode()==g) {
							//System.out.println(aux.getNode());
							aux=enlace.get(y);
							node.add(g);
							//	System.out.println(aux.getNode());
							caminoMinimo(aux, des);
						}
					}

				}
			}
		}

	}

	public ArrayList<Line> getEdge() {
		return edge;
	}

	public void setEdge(ArrayList<Line> edge) {
		this.edge = edge;
	}

	public ArrayList<Circle> getNode() {
		return node;
	}

	public void setNode(ArrayList<Circle> node) {
		this.node = node;
	}

}
