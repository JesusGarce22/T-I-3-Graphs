package ui;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import model.Edge;
import model.Node;

public class MainWindows extends Stage {
	@FXML
	private Line llerasCamargoBrisasdeMayo;
	@FXML
	private Circle nuevoLatir;
	@FXML
	private Circle villacolombia;
	@FXML
	private Line amanecerTroncalunida;
	@FXML
	private Line villanuevaConquistadores;
	@FXML
	private Line andresSaninCalipso;
	@FXML
	private Circle chapinero;
	@FXML
	private Circle troncalUnida;
	@FXML
	private Line caldasCapri;
	@FXML
	private Line buitreraUnivalle;
	@FXML
	private Line univalleUniversidades;
	@FXML
	private Circle andresSanin;
	@FXML
	private Line pasoDelComercioChiminangos;
	@FXML
	private Circle sanPascual;
	@FXML
	private Line ManzanaresFatima;
	@FXML
	private Line lasAmericasVersalles;
	@FXML
	private Circle floraIndustrial;
	@FXML
	private Circle alamos;
	@FXML
	private Circle calipso;
	@FXML
	private Line florestaBelalcazar;
	@FXML
	private Circle capri;
	@FXML
	private Circle conquistadores;
	@FXML
	private Line belalcazarSanPascual;
	@FXML
	private Line salomiaPopular;
	@FXML
	private Circle TierraBlanca;
	@FXML
	private Circle unidadDeportiva;
	@FXML
	private Circle Icesi;
	@FXML
	private Circle pradosdelNorte;
	@FXML
	private Circle pampalinda;
	@FXML
	private Circle plazaDetoros;
	@FXML
	private Line simonBolivarRefugio;
	@FXML
	private Circle chiminangos;
	@FXML
	private Line salomiaFloraindustrial;
	@FXML
	private Line calipsoSimonbolivar;
	@FXML
	private Line fatimaRiocali;
	@FXML
	private Line rioCaliTorredecali;
	@FXML
	private Line lasAmericasPradosdelnorte;
	@FXML
	private Line capriMelendez;
	@FXML
	private Line sanNicolasPiloto;
	@FXML
	private Line centroPlazadecaicedo;
	@FXML
	private Circle salomia;
	@FXML
	private Circle buitrera;
	@FXML
	private Circle primitivo;
	@FXML
	private Circle santaRosa;
	@FXML
	private Circle centro;
	@FXML
	private Circle santaMonica;
	@FXML
	private Line universidadesIcesi;
	@FXML
	private Circle sanBosco;
	@FXML
	private Line pampalindaRefugio;
	@FXML
	private Circle popular;
	@FXML
	private Line sanPascualCienpalos;
	@FXML
	private Line TequendamaLido;
	@FXML
	private Line vipasaPradosdelnorte;
	@FXML
	private Line andresSaninChiminangos;
	@FXML
	private Circle vipasa;
	@FXML
	private Line mengaPasodelComercio;
	@FXML
	private Line sucrePetecuy;
	@FXML
	private Line uDeportivaLido;
	@FXML
	private Line sucreBelalcazar;
	@FXML
	private Circle sanNicolas;
	@FXML
	private Circle versalles;
	@FXML
	private Circle caldas;
	@FXML
	private Line ermitaTorredecali;
	@FXML
	private Line sucreSanPascual;
	@FXML
	private Line villacolombiaEltrebol;
	@FXML
	private Line sanPedroPetecuy;
	@FXML
	private Circle rioCali;
	@FXML
	private Circle Menga;
	@FXML
	private Circle cienPalos;
	@FXML
	private Line refugioCaldas;
	@FXML
	private Line sanNicolasTorredecali;
	@FXML
	private Line uDeportivaTierraBlanca;
	@FXML
	private Line chapineroEltrebol;
	@FXML
	private Line villacolombiaSietedeAgosto;
	@FXML
	private Line pampalindaPlazadetoros;
	@FXML
	private Line sanBoscoSanPascual;
	@FXML
	private Circle atanasioGirardot;
	@FXML
	private Circle aguablanca;
	@FXML
	private Line FrayDamianCentro;
	@FXML
	private Circle santaLibrada;
	@FXML
	private Circle frayDamian;
	@FXML
	private Line andresSaninSietedeAgosto;
	@FXML
	private Circle fatima;
	@FXML
	private Circle universidades;
	@FXML
	private Line vipasaAlamos;
	@FXML
	private Line villanuevaSantamonica;
	@FXML
	private Line FrayDamianSantaRosa;
	@FXML
	private Line primitivoSantamonica;
	@FXML
	private Line FrayDamianSanPascual;
	@FXML
	private Circle torredeCali;
	@FXML
	private Line uDeportivaPlazadetoros;
	@FXML
	private Line sanPedroTorredecali;
	@FXML
	private Line mengaAlamos;
	@FXML
	private Line centroErmita;
	@FXML
	private Line simonBolivarUniversidades;
	@FXML
	private Circle sieteDeAgosto;
	@FXML
	private Circle estadio;
	@FXML
	private Circle piloto;
	@FXML
	private Line calipsoConquistadores;
	@FXML
	private Circle simonBolivar;
	@FXML
	private Circle amanecer;
	@FXML
	private Line fatimaPiloto;
	@FXML
	private Circle pasodelComercio;
	@FXML
	private Line calipsoTroncalUnida;
	@FXML
	private Line tequendamaEstadio;
	@FXML
	private Line florestaAtanasioGirardot;
	@FXML
	private Circle sanPedro;
	@FXML
	private Line manzanadelsaberEstadio;
	@FXML
	private Circle melendez;
	@FXML
	private Circle sucre;
	@FXML
	private Line lasAmericasTorredecali;
	@FXML
	private Line nuevoLatirAndresSanin;
	@FXML
	private Circle manzanares;
	@FXML
	private Circle petecuy;
	@FXML
	private Circle santaRosa1;
	@FXML
	private Line melendezBuitrera;
	@FXML
	private Line nuevoLatirAguablanca;
	@FXML
	private Line primitivoCienpalos;
	@FXML
	private Line andresSaninPasoDelComercio;
	@FXML
	private Circle villanueva;
	@FXML
	private Circle manzanadelSaber;
	@FXML
	private Line mengaChiminangos;
	@FXML
	private Circle belalzacar;
	@FXML
	private Line sanBoscoSantaLibrada;
	@FXML
	private Circle univalle;
	@FXML
	private Line andresSaninSalomia;
	@FXML
	private Circle ermita;
	@FXML
	private Line amanecerNuevoLatir;
	@FXML
	private Circle lasAmericas;
	@FXML
	private Line manzanadelsaberSantaLibrada;
	@FXML
	private Line aguablancaAndresSanin;
	@FXML
	private Circle tequendama;
	@FXML
	private Line chiminangosFloraindustrial;
	@FXML
	private Circle refugio;
	@FXML
	private Circle pampalinda3;
	@FXML
	private Circle lido;
	@FXML
	private Circle plazaCayzedo;
	@FXML
	private Line chapineroAtanasioGirardot;
	@FXML
	private Line llerasCamargoTierraBlanca;
	@FXML
	private Circle elTrebol;
	@FXML
	private Circle floresta;
	@FXML
	private Line ManzanaresPopular;
	@FXML
	private BorderPane mainPane;
	@FXML
	private Button mapBt;
	@FXML
	private Button backBt;
	@FXML
	private Button exitBt;
	@FXML
	private TextField userName;
	@FXML
	private Button searchBt;
	@FXML
	private ComboBox<String> now;
	 @FXML
	    private Circle LlerasCamargo;

	    @FXML
	    private Circle brisasdeMayo;

	@FXML
	private ComboBox<String> then;
	private static double[][] distances;
	
	
	private static ArrayList<Edge> edge;
	private static ArrayList<Circle> node;

	public MainWindows() {
		node= new ArrayList<Circle>();
		
	}

	@FXML
	void openMapp(ActionEvent event)throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Map.fxml"));

		loader.setController(this);
		Parent addUser = loader.load();

		mainPane.setCenter(addUser);
		mainPane.getChildren().clear();
		mainPane.setTop(addUser);

	}

	@FXML
	void exitOfProgram(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void search(ActionEvent event) {

	}

	public void loadLogin() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindows.fxml"));

		loader.setController(this);
		Parent addUser = loader.load();
		chargeComboBox();
		mainPane.setCenter(addUser);
		mainPane.getChildren().clear();
		mainPane.setTop(addUser);

	}

	public void chargeComboBox() {
		loadNodes();
		ArrayList<String> items=new ArrayList<String>();
			for(int i=0;i<node.size();i++) {
				if(node.get(i)!=null) {
					items.add(node.get(i).getId());
				}
				
			}
			
		distances=new double [node.size()][node.size()];
		now.getItems().addAll(items);
		then.getItems().addAll(items);
	}

	@FXML
	void back(ActionEvent event) throws IOException {
		loadLogin();
		this.close();
	}
	
	public void loadNodes() {
		node.add(nuevoLatir);
		node.add(aguablanca);
		node.add(calipso);
		node.add(andresSanin);
		node.add(sieteDeAgosto);
		node.add(villacolombia);
		node.add(villanueva);
		node.add(elTrebol);
		node.add(atanasioGirardot);
		node.add(belalzacar);
		node.add(chapinero);
		node.add(troncalUnida);
		node.add(sanPascual);
		node.add(floraIndustrial);
		node.add(alamos);
		node.add(capri);
		node.add(conquistadores);
		node.add(Icesi);
		node.add(TierraBlanca);
		node.add(unidadDeportiva);
		node.add(pampalinda);
		node.add(pradosdelNorte);
		node.add(plazaDetoros);
		node.add(chiminangos);
		node.add(salomia);
		node.add(buitrera);
		node.add(primitivo);
		node.add(santaRosa);
		node.add(centro);
		node.add(santaMonica);
		node.add(sanBosco);
		node.add(popular);
		node.add(vipasa);
		node.add(sanNicolas);
		node.add(versalles);
		node.add(caldas);
		node.add(rioCali);
		node.add(Menga);
		node.add(cienPalos);
		node.add(santaLibrada);
		node.add(frayDamian);
		node.add(fatima);
		node.add(universidades);
		node.add(torredeCali);
		node.add(estadio);
		node.add(piloto);
		node.add(pasodelComercio);
		node.add(simonBolivar);
		node.add(amanecer);
		node.add(sanPedro);
		node.add(melendez);
		node.add(sucre);
		node.add(manzanares);
		node.add(petecuy);
		node.add(manzanadelSaber);
		node.add(univalle);
		node.add(ermita);
		node.add(lasAmericas);
		node.add(tequendama);
		node.add(refugio);
		node.add(lido);
		node.add(plazaCayzedo);
		node.add(floresta);
		node.add(LlerasCamargo);
		node.add(brisasdeMayo);
		
	}

	public void orderDistances() {
		
	}
}
