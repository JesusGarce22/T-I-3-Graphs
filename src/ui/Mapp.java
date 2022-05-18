package ui;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Edge;
import model.Node;

public class Mapp extends Stage{

	private ArrayList<Node> node;
	private ArrayList<Edge> edge;
	
	public Mapp() {

		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Map.fxml"));
			Parent root;
			root = loader.load();
			
			Scene scene = new Scene(root, 714, 687);
			setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	public void addNode(Node n) {
		node.add(n);
	}
	
	public void importDates() {
		
		ArrayList<Edge> u= new ArrayList<>();
		Node n=new Node(u,"ESTACION UNIVALLE","Carrera 100 con Calle 13");
		
		/* 
		 * ESTACION UNIVERSIDADES – Carrera 100 con Calle 16

ESTACION UNIVALLE – Carrera 100 con Calle 13

ESTACION BUITRERA – Carrera 100 con Calle 5

ESTACION MELENDEZ – Calle 5 con Carrera 95

ESTACION CAPRI – Calle 5 con Carrera 78

ESTACION CALDAS  – Calle 5 con Carrera 70

ESTACION REFUGIO – Calle 5 con Carrera 66

ESTACION PAMPALINDA – Calle 5 con Carrera 62

ESTACION PLAZA DE TOROS – Calle 5 con Carrera 56

ESTACION UNIDAD DEPORTIVA – Calle 5 con Carrera 52

ESTACION LIDO – Calle 5 con Carrera 46

ESTACION TEQUENDAMA – Calle 5 con Carrera 39

ESTACION ESTADIO – Calle 5 con Carrera 36

ESTACION MANZANA DEL SABER – Calle 5 con Carrera 27

ESTACION SANTA LIBRADA – Calle 5 con Carrera 22

ESTACION SAN BOSCO – Carrera 15 con Calle 9

ESTACION SAN PASCUAL – Carrera 15 con Calle 13

ESTACION BELALCAZAR – Carrera 15 con Calle 21

ESTACION FLORESTA – Carrera 15 con Calle 30

ESTACION ATANASIO GIRARDOT – Carrera 15 con Calle 34

ESTACION CHAPINERO – Carrera 15 con Calle 48

ESTACION VILLACOLOMBIA – Carrera 15 con Calle 52

ESTACION EL TREBOL – Carrera 15 con Calle 58

ESTACION 7 DE AGOSTO – Carrera 15 con Calle 71A

ESTACION CIEN PALOS – Carrera 17 con Calle 18

ESTACION PRIMITIVO – Transversal 25 con Diagonal 18

ESTACION SANTA MONICA – Transversal 25 con Calle 28

ESTACION VILLANUEVA – Transversal 25 con Calle 32

ESTACION CONQUISTADORES – Transversal 29 con Calle 44

ESTACION TRONCAL UNIDA – Carrera 28D con Calle 72I

ESTACION AMANECER – Carrera 28D con Calle 72U

ESTACION NUEVO LATIR – Carrera 28D con Calle 80

ESTACION FRAY DAMIAN – Calle 13 con Carrera 15

ESTACION SANTA ROSA – Calle 13 con Carrera 10

ESTACION CENTRO – Calle 13 con Carrera 8

ESTACION PLAZA DE CAICEDO – Calle 13 con Carrera 4

ESTACION ERMITA – Calle 13 con Carrera 3 

ESTACION SAN PEDRO – Calle 15 con Carrera 4

ESTACION PETECUY – Calle 15 con Carrera 8

ESTACION SUCRE – Calle 15 con Carrera 15

ESTACION TORRE DE CALI – Calle 15 con Carrera 4N

ESTACION RIO CALI – Carrera 4N con Calle 23

ESTACION SAN NICOLAS – Carrera 1 con Calle 21

ESTACION PILOTO – Carrera 1 con Calle 24

ESTACION FATIMA – Carrera 1 con Calle 30

ESTACION MANZANARES – Carrera 1 con Calle 39

ESTACION POPULAR – Carrera 1 con Calle 44

ESTACION SALOMIA – Carrera 1 con Calle 47

ESTACION FLORA INDUSTRIAL – Carrera 1 con Calle 56

ESTACION CHIMANGOS – Carrera 1 con Calle 64

ESTACION VERSALLES – Avenida 3N con Calle 21N

ESTACION AVENIDA LAS AMERICAS – Avenida 3N con Calle 23BN

ESTACION PRADOS DEL NORTE – Avenida 3N con Calle 38N

ESTACION VIPASA – Avenida 3N con Calle 44N

ESTACION ALAMOS – Avenida 3N con Calle 52N
		 * */
	}
}
