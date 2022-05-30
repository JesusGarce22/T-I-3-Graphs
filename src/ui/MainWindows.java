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
	
	
	private static ArrayList<Line> edge;
	private static ArrayList<Circle> node;
	private static ArrayList<Edge> eg;

	public MainWindows() {
		node= new ArrayList<Circle>();
		edge = new ArrayList<Line>();
		eg = new ArrayList<Edge>();
		
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
	
	public void loadEdge() {
		
		edge.add(FrayDamianCentro);
		edge.add(ManzanaresFatima);
		edge.add(ManzanaresPopular);
		edge.add(TequendamaLido);
		edge.add(aguablancaAndresSanin);
		edge.add(amanecerNuevoLatir);
		edge.add(amanecerTroncalunida);
		edge.add(andresSaninCalipso);
		edge.add(andresSaninChiminangos);
		edge.add(andresSaninPasoDelComercio);
		edge.add(andresSaninSalomia);
		edge.add(andresSaninSietedeAgosto);
		edge.add(belalcazarSanPascual);
		edge.add(buitreraUnivalle);
		edge.add(calipsoConquistadores);
		edge.add(capriMelendez);
		edge.add(centroErmita);
		edge.add(centroPlazadecaicedo);
		edge.add(chapineroAtanasioGirardot);
		edge.add(chapineroEltrebol);
		edge.add(ermitaTorredecali);
		edge.add(florestaAtanasioGirardot);
		edge.add(florestaBelalcazar);
		edge.add(lasAmericasPradosdelnorte);
		edge.add(lasAmericasTorredecali);
		edge.add(lasAmericasVersalles);
		edge.add(llerasCamargoBrisasdeMayo);
		edge.add(llerasCamargoTierraBlanca);
		edge.add(manzanadelsaberEstadio);
		edge.add(manzanadelsaberSantaLibrada);
		edge.add(melendezBuitrera);
		edge.add(mengaAlamos);
		edge.add(mengaChiminangos);
		edge.add(mengaPasodelComercio);
		edge.add(nuevoLatirAguablanca);
		edge.add(nuevoLatirAndresSanin);
		edge.add(pampalindaPlazadetoros);
		edge.add(pampalindaRefugio);
		edge.add(pasoDelComercioChiminangos);
		edge.add(primitivoCienpalos);
		edge.add(refugioCaldas);
		edge.add(rioCaliTorredecali);
		edge.add(sanNicolasTorredecali);
		edge.add(sanPascualCienpalos);
		edge.add(sanPedroPetecuy);
		edge.add(sanPedroTorredecali);
		edge.add(simonBolivarRefugio);
		edge.add(simonBolivarUniversidades);
		edge.add(sucreBelalcazar);
		edge.add(sucrePetecuy);
		edge.add(sucreSanPascual);
		edge.add(tequendamaEstadio);
		edge.add(uDeportivaLido);
		edge.add(uDeportivaPlazadetoros);
		edge.add(uDeportivaTierraBlanca);
		edge.add(univalleUniversidades);
		edge.add(universidadesIcesi);
		edge.add(villacolombiaEltrebol);
		edge.add(villacolombiaSietedeAgosto);
		edge.add(villanuevaConquistadores);
		edge.add(villanuevaSantamonica);
		edge.add(vipasaPradosdelnorte);
		edge.add(FrayDamianSanPascual);
		edge.add(FrayDamianSantaRosa);
		edge.add(caldasCapri);
		edge.add(calipsoSimonbolivar);
		edge.add(calipsoTroncalUnida);
		edge.add(chiminangosFloraindustrial);
		edge.add(fatimaPiloto);
		edge.add(fatimaRiocali);
		edge.add(primitivoSantamonica);
		edge.add(salomiaFloraindustrial);
		edge.add(salomiaPopular);
		edge.add(sanBoscoSanPascual);
		edge.add(sanBoscoSantaLibrada);
		edge.add(sanNicolasPiloto);
		edge.add(vipasaAlamos);
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
		eg.add(new Edge(universidadesIcesi, 3600, null));
		eg.add(new Edge(univalleUniversidades, 950 , null));
		eg.add(new Edge(buitreraUnivalle , 450, null));
		eg.add(new Edge(melendezBuitrera, 600 , null));
		eg.add(new Edge(capriMelendez , 1200, null));
		eg.add(new Edge(caldasCapri ,900 , null));
		eg.add(new Edge(refugioCaldas , 500 , null));
		//eg.add(new Edge( , , null));
		eg.add(new Edge(pampalindaRefugio ,550, null));
		eg.add(new Edge(pampalindaPlazadetoros ,700 , null));
		eg.add(new Edge(uDeportivaPlazadetoros ,650 , null));
		eg.add(new Edge(uDeportivaLido , 450 , null));
		eg.add(new Edge(TequendamaLido,550 , null));
		eg.add(new Edge(tequendamaEstadio, 1000 , null));
		eg.add(new Edge(manzanadelsaberEstadio ,450, null));
		eg.add(new Edge(manzanadelsaberSantaLibrada ,700 , null));
		eg.add(new Edge(sanBoscoSantaLibrada,550, null));
		eg.add(new Edge(sanBoscoSanPascual,600 , null));
		eg.add(new Edge(FrayDamianSanPascual , 250, null));
		eg.add(new Edge(FrayDamianSantaRosa ,900, null));
		eg.add(new Edge(null ,250 , null));
		eg.add(new Edge(centroPlazadecaicedo,450 , null));
		eg.add(new Edge(null, 110 , null));
		eg.add(new Edge(ermitaTorredecali , 450 , null));
		eg.add(new Edge(null ,600, null));
		eg.add(new Edge(lasAmericasVersalles , 300 , null));
		eg.add(new Edge(lasAmericasPradosdelnorte ,1500 , null));
		eg.add(new Edge(vipasaPradosdelnorte,550 , null));
		eg.add(new Edge(vipasaAlamos ,900 , null));
		eg.add(new Edge(mengaAlamos ,900 , null));
		eg.add(new Edge(sucreSanPascual , 300, null));
		eg.add(new Edge(sucrePetecuy ,600 , null));
		eg.add(new Edge(sanPedroPetecuy, 650, null));
		eg.add(new Edge(sanPedroTorredecali ,280, null));
		eg.add(new Edge(rioCaliTorredecali ,700 , null));
		eg.add(new Edge(sanNicolasTorredecali ,600 , null));
		eg.add(new Edge(sanNicolasPiloto ,400 , null));
		eg.add(new Edge(fatimaPiloto ,750 , null));
		eg.add(new Edge(fatimaRiocali ,1100 , null));
		eg.add(new Edge(ManzanaresFatima ,600 , null));
		eg.add(new Edge(ManzanaresPopular,1200 , null));
		eg.add(new Edge(salomiaPopular ,650, null));
		eg.add(new Edge(salomiaFloraindustrial ,1700 , null));
		eg.add(new Edge(chiminangosFloraindustrial ,1700 , null));
		eg.add(new Edge(pasoDelComercioChiminangos ,1900 , null));
		eg.add(new Edge(mengaPasodelComercio ,3000 , null));
		eg.add(new Edge(simonBolivarRefugio ,2900 , null));
		eg.add(new Edge(simonBolivarUniversidades ,3700 , null));
		eg.add(new Edge(calipsoSimonbolivar ,4400 , null));
		eg.add(new Edge(andresSaninCalipso ,3100 , null));
		eg.add(new Edge(null , 900, null));
		eg.add(new Edge(calipsoConquistadores ,800 , null));
		eg.add(new Edge(villanuevaConquistadores ,1000 , null));
		eg.add(new Edge(villanuevaSantamonica ,400 , null));
		eg.add(new Edge(primitivoSantamonica ,500 , null));
		eg.add(new Edge(primitivoCienpalos ,650 , null));
		eg.add(new Edge(sanPascualCienpalos ,650 , null));
		eg.add(new Edge(calipsoTroncalUnida ,800 , null));
		eg.add(new Edge(amanecerTroncalunida ,550 , null));
		eg.add(new Edge(amanecerNuevoLatir ,550 , null));
		eg.add(new Edge(nuevoLatirAguablanca ,900 , null));
		eg.add(new Edge(aguablancaAndresSanin ,3700 , null));
		eg.add(new Edge(nuevoLatirAndresSanin ,3300 , null));
		eg.add(new Edge(andresSaninChiminangos ,5600 , null));
		eg.add(new Edge(mengaChiminangos ,1800 , null));
		eg.add(new Edge(andresSaninSalomia ,6000 , null));
		eg.add(new Edge(belalcazarSanPascual ,750 , null));
		eg.add(new Edge(florestaBelalcazar ,700 , null));
		eg.add(new Edge(florestaAtanasioGirardot ,700 , null));
		eg.add(new Edge(chapineroAtanasioGirardot ,700 , null));
		eg.add(new Edge(null,350 , null));
		eg.add(new Edge(chapineroEltrebol ,350 , null));
		eg.add(new Edge(null ,1400 , null));
		eg.add(new Edge(andresSaninSietedeAgosto ,750 , null));
		//eg.add(new Edge( , , null));
		//eg.add(new Edge( , , null));
		//eg.add(new Edge( , , null));
		
		
	}

	public void orderDistances() {
		
		
		
	}
}
