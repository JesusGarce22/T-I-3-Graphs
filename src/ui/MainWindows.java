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
		ArrayList n1 = new ArrayList<Circle>();
		n1.add(Icesi);
		n1.add(universidades);
		eg.add(new Edge(universidadesIcesi, 3600, n1));
		
		ArrayList n2 = new ArrayList<Circle>();
		n2.add(univalle);
		n2.add(universidades);
		eg.add(new Edge(univalleUniversidades, 950 , n2));
		
		ArrayList n3 = new ArrayList<Circle>();
		n3.add(buitrera);
		n3.add(univalle);
		eg.add(new Edge(buitreraUnivalle , 450, n3));
		
		ArrayList n4 = new ArrayList<Circle>();
		n4.add(melendez);
		n4.add(buitrera);
		eg.add(new Edge(melendezBuitrera, 600 , n4));
		
		ArrayList n5 = new ArrayList<Circle>();
		n5.add(capri);
		n5.add(melendez);
		eg.add(new Edge(capriMelendez , 1200, n5));
		
		ArrayList n6 = new ArrayList<Circle>();
		n6.add(caldas);
		n6.add(capri);
		eg.add(new Edge(caldasCapri ,900 , n6));
		
		ArrayList n7 = new ArrayList<Circle>();
		n7.add(refugio);
		n7.add(caldas);
		eg.add(new Edge(refugioCaldas , 500 , n7));
		
		//eg.add(new Edge( , , null));
		
		ArrayList n8 = new ArrayList<Circle>();
		n8.add(pampalinda);
		n8.add(refugio);
		eg.add(new Edge(pampalindaRefugio ,550, n8));
		
		ArrayList n9 = new ArrayList<Circle>();
		n9.add(pampalinda);
		n9.add(plazaDetoros);
		eg.add(new Edge(pampalindaPlazadetoros ,700 , n9));
		
		ArrayList n10 = new ArrayList<Circle>();
		n10.add(unidadDeportiva);
		n10.add(plazaDetoros);
		eg.add(new Edge(uDeportivaPlazadetoros ,650 , n10));
		
		ArrayList n11 = new ArrayList<Circle>();
		n11.add(unidadDeportiva);
		n11.add(lido);
		eg.add(new Edge(uDeportivaLido , 450 , n11));
		
		ArrayList n12 = new ArrayList<Circle>();
		n12.add(tequendama);
		n12.add(lido);
		eg.add(new Edge(TequendamaLido,550 , n12));
		
		ArrayList n13 = new ArrayList<Circle>();
		n13.add(tequendama);
		n13.add(estadio);
		eg.add(new Edge(tequendamaEstadio, 1000 , n13));
		
		ArrayList n14 = new ArrayList<Circle>();
		n14.add(manzanadelSaber);
		n14.add(estadio);
		eg.add(new Edge(manzanadelsaberEstadio ,450, n14));
		
		ArrayList n15 = new ArrayList<Circle>();
		n15.add(manzanadelSaber);
		n15.add(santaLibrada);
		eg.add(new Edge(manzanadelsaberSantaLibrada ,700 , n15));
		
		ArrayList n16 = new ArrayList<Circle>();
		n16.add(sanBosco);
		n16.add(santaLibrada);
		eg.add(new Edge(sanBoscoSantaLibrada,550, n16));
		
		ArrayList n17 = new ArrayList<Circle>();
		n17.add(sanBosco);
		n17.add(sanPascual);
		eg.add(new Edge(sanBoscoSanPascual,600 , n17));
		
		ArrayList n18 = new ArrayList<Circle>();
		n18.add(frayDamian);
		n18.add(sanPascual);
		eg.add(new Edge(FrayDamianSanPascual , 250, n18));
		
		ArrayList n19 = new ArrayList<Circle>();
		n19.add(frayDamian);
		n19.add(santaRosa);
		eg.add(new Edge(FrayDamianSantaRosa ,900, n19));
		
		ArrayList n20 = new ArrayList<Circle>();
		//////////////////////////////////////////////
		//////////////////////////////////////////////
		eg.add(new Edge(null ,250 , n20));
		
		ArrayList n21 = new ArrayList<Circle>();
		n21.add(centro);
		n21.add(plazaCayzedo);
		eg.add(new Edge(centroPlazadecaicedo,450 , n21));
		
		ArrayList n22 = new ArrayList<Circle>();
		///////////////////////////////////////////
		////////////////////////////////////////////
		eg.add(new Edge(null, 110 , n22));
		
		ArrayList n23 = new ArrayList<Circle>();
		n23.add(ermita);
		n23.add(torredeCali);
		eg.add(new Edge(ermitaTorredecali , 450 , n23));
		
		ArrayList n24 = new ArrayList<Circle>();
		//////////////////////////////////////////////
		//////////////////////////////////////////////
		eg.add(new Edge(null ,600, n24));
		
		ArrayList n25 = new ArrayList<Circle>();
		n25.add(lasAmericas);
		n25.add(versalles);
		eg.add(new Edge(lasAmericasVersalles , 300 , n25));
		
		ArrayList n26 = new ArrayList<Circle>();
		n26.add(lasAmericas);
		n26.add(pradosdelNorte);
		eg.add(new Edge(lasAmericasPradosdelnorte ,1500 , n26));
		
		ArrayList n27 = new ArrayList<Circle>();
		n27.add(vipasa);
		n27.add(pradosdelNorte);
		eg.add(new Edge(vipasaPradosdelnorte,550 , n27));
		
		ArrayList n28 = new ArrayList<Circle>();
		n28.add(vipasa);
		n28.add(alamos);
		eg.add(new Edge(vipasaAlamos ,900 , n28));
		
		ArrayList n29 = new ArrayList<Circle>();
		n29.add(Menga);
		n29.add(alamos);
		eg.add(new Edge(mengaAlamos ,900 , n29));
		
		ArrayList n30 = new ArrayList<Circle>();
		n30.add(sucre);
		n30.add(sanPascual);
		eg.add(new Edge(sucreSanPascual , 300, n30));
		
		ArrayList n31 = new ArrayList<Circle>();
		n31.add(sucre);
		n31.add(petecuy);
		eg.add(new Edge(sucrePetecuy ,600 , n31));
		
		ArrayList n32 = new ArrayList<Circle>();
		n32.add(sanPedro);
		n32.add(petecuy);
		eg.add(new Edge(sanPedroPetecuy, 650, n32));
		
		ArrayList n33 = new ArrayList<Circle>();
		n33.add(sanPedro);
		n33.add(torredeCali);
		eg.add(new Edge(sanPedroTorredecali ,280, n33));
		
		ArrayList n34 = new ArrayList<Circle>();
		n34.add(rioCali);
		n34.add(torredeCali);
		eg.add(new Edge(rioCaliTorredecali ,700 , n34));
		
		ArrayList n35 = new ArrayList<Circle>();
		n35.add(sanNicolas);
		n35.add(torredeCali);
		eg.add(new Edge(sanNicolasTorredecali ,600 , n35));
		
		ArrayList n36 = new ArrayList<Circle>();
		n36.add(sanNicolas);
		n36.add(piloto);
		eg.add(new Edge(sanNicolasPiloto ,400 , n36));
		
		ArrayList n37 = new ArrayList<Circle>();
		n37.add(piloto);
		n37.add(fatima);
		eg.add(new Edge(fatimaPiloto ,750 , n37));
		
		ArrayList n38 = new ArrayList<Circle>();
		n38.add(fatima);
		n38.add(rioCali);
		eg.add(new Edge(fatimaRiocali ,1100 , n38));
		
		ArrayList n39 = new ArrayList<Circle>();
		n39.add(manzanares);
		n39.add(fatima);
		eg.add(new Edge(ManzanaresFatima ,600 , n39));
		
		ArrayList n40 = new ArrayList<Circle>();
		n40.add(manzanares);
		n40.add(popular);
		eg.add(new Edge(ManzanaresPopular,1200 , n40));
		
		ArrayList n41 = new ArrayList<Circle>();
		n41.add(salomia);
		n41.add(popular);
		eg.add(new Edge(salomiaPopular ,650, n41));
		
		ArrayList n42 = new ArrayList<Circle>();
		n42.add(salomia);
		n42.add(floraIndustrial);
		eg.add(new Edge(salomiaFloraindustrial ,1700 , n42));
		
		ArrayList n43 = new ArrayList<Circle>();
		n43.add(chiminangos);
		n43.add(floraIndustrial);
		eg.add(new Edge(chiminangosFloraindustrial ,1700 , n43));
		
		ArrayList n44 = new ArrayList<Circle>();
		n44.add(pasodelComercio);
		n44.add(chiminangos);
		eg.add(new Edge(pasoDelComercioChiminangos ,1900 , n44));
		
		ArrayList n45 = new ArrayList<Circle>();
		n45.add(Menga);
		n45.add(pasodelComercio);
		eg.add(new Edge(mengaPasodelComercio ,3000 , n45));
		
		ArrayList n46 = new ArrayList<Circle>();
		n46.add(simonBolivar);
		n46.add(refugio);
		eg.add(new Edge(simonBolivarRefugio ,2900 , n46));
		
		ArrayList n47 = new ArrayList<Circle>();
		n47.add(simonBolivar);
		n47.add(universidades);
		eg.add(new Edge(simonBolivarUniversidades ,3700 , n47));
		
		ArrayList n48 = new ArrayList<Circle>();
		n48.add(calipso);
		n48.add(simonBolivar);
		eg.add(new Edge(calipsoSimonbolivar ,4400 , n48));
		
		ArrayList n49 = new ArrayList<Circle>();
		n49.add(andresSanin);
		n49.add(calipso);
		eg.add(new Edge(andresSaninCalipso ,3100 , n49));
		
		ArrayList n50 = new ArrayList<Circle>();
		//////////////////////////////////////////////7
		////////////////////////////////////////////////
		eg.add(new Edge(null , 900, n50));
		
		ArrayList n51 = new ArrayList<Circle>();
		n51.add(calipso);
		n51.add(conquistadores);
		eg.add(new Edge(calipsoConquistadores ,800 , n51));
		
		ArrayList n52 = new ArrayList<Circle>();
		n52.add(villanueva);
		n52.add(conquistadores);
		eg.add(new Edge(villanuevaConquistadores ,1000 , n52));
		
		ArrayList n53 = new ArrayList<Circle>();
		n53.add(villanueva);
		n53.add(santaMonica);
		eg.add(new Edge(villanuevaSantamonica ,400 , n53));
		
		ArrayList n54 = new ArrayList<Circle>();
		n54.add(primitivo);
		n54.add(santaMonica);
		eg.add(new Edge(primitivoSantamonica ,500 , n54));
		
		ArrayList n55 = new ArrayList<Circle>();
		n55.add(primitivo);
		n55.add(cienPalos);
		eg.add(new Edge(primitivoCienpalos ,650 , n55));
		
		ArrayList n56 = new ArrayList<Circle>();
		n56.add(sanPascual);
		n56.add(cienPalos);
		eg.add(new Edge(sanPascualCienpalos ,650 , n56));
		
		ArrayList n57 = new ArrayList<Circle>();
		n57.add(calipso);
		n57.add(troncalUnida);
		eg.add(new Edge(calipsoTroncalUnida ,800 , n57));
		
		ArrayList n58 = new ArrayList<Circle>();
		eg.add(new Edge(amanecerTroncalunida ,550 , n58));
		
		ArrayList n59 = new ArrayList<Circle>();
		n59.add(amanecer);
		n59.add(nuevoLatir);
		eg.add(new Edge(amanecerNuevoLatir ,550 , n59));
		
		ArrayList n60 = new ArrayList<Circle>();
		n60.add(nuevoLatir);
		n60.add(aguablanca);
		eg.add(new Edge(nuevoLatirAguablanca ,900 , n60));
		
		ArrayList n61 = new ArrayList<Circle>();
		n61.add(aguablanca);
		n61.add(andresSanin);
		eg.add(new Edge(aguablancaAndresSanin ,3700 , n61));
		
		ArrayList n62 = new ArrayList<Circle>();
		n62.add(nuevoLatir);
		n62.add(andresSanin);
		eg.add(new Edge(nuevoLatirAndresSanin ,3300 , n62));
		
		ArrayList n63 = new ArrayList<Circle>();
		n63.add(andresSanin);
		n63.add(chiminangos);
		eg.add(new Edge(andresSaninChiminangos ,5600 , n63));
		
		ArrayList n64 = new ArrayList<Circle>();
		n64.add(Menga);
		n64.add(chiminangos);
		eg.add(new Edge(mengaChiminangos ,1800 , n64));
		
		ArrayList n65 = new ArrayList<Circle>();
		n65.add(andresSanin);
		n65.add(salomia);
		eg.add(new Edge(andresSaninSalomia ,6000 , n65));
		
		ArrayList n66 = new ArrayList<Circle>();
		n66.add(belalzacar);
		n66.add(sanPascual);
		eg.add(new Edge(belalcazarSanPascual ,750 , n66));
		
		ArrayList n67 = new ArrayList<Circle>();
		n67.add(floresta);
		n67.add(belalzacar);
		eg.add(new Edge(florestaBelalcazar ,700 , n67));
		
		ArrayList n68 = new ArrayList<Circle>();
		n68.add(floresta);
		n68.add(atanasioGirardot);
		eg.add(new Edge(florestaAtanasioGirardot ,700 , n68));
		
		ArrayList n69 = new ArrayList<Circle>();
		n69.add(chapinero);
		n69.add(atanasioGirardot);
		eg.add(new Edge(chapineroAtanasioGirardot ,700 , n69));
		
		ArrayList n70 = new ArrayList<Circle>();
		///////////////////////////////////////////
		//////////////////////////////////////////
		eg.add(new Edge(null,350 , n70));
		
		ArrayList n71 = new ArrayList<Circle>();
		n71.add(chapinero);
		n71.add(elTrebol);
		eg.add(new Edge(chapineroEltrebol ,350 , n71));
		
		ArrayList n72 = new ArrayList<Circle>();
		////////////////////////////////////////////
		/////////////////////////////////////////////
		eg.add(new Edge(null ,1400 , n72));
		
		ArrayList n73 = new ArrayList<Circle>();
		n73.add(andresSanin);
		n73.add(sieteDeAgosto);
		eg.add(new Edge(andresSaninSietedeAgosto ,750 , n73));
		
		
		//eg.add(new Edge( , , null));
		//eg.add(new Edge( , , null));
		//eg.add(new Edge( , , null));
		
		
	}

	public void orderDistances() {
		
		
		
	}
}
