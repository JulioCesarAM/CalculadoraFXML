package dad.javafx.calculadora.aplicacion;

import dad.javafx.calculadora.controlador.ModificarVista;
import dad.javafx.calculadora.vista.Vista;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	private ModificarVista controlador;
	private DoubleProperty contenedorValorCambiante;
	@Override
	public void start(Stage primaryStage) throws Exception {
		//vista = new Vista();
		controlador=new ModificarVista();
		System.out.println(controlador);
		System.out.println();
		

		Scene verScene=new Scene(controlador.getCalculadora().getCalculadora(),400,400);
		Stage prueba = new Stage();
		prueba.setScene(verScene);
		prueba.show();
		//comienza las pruebas
//		contenedorValorCambiante=new SimpleDoubleProperty(Double.parseDouble(controlador.getValorPantalla()));
//		
//		controlador.getCalculadora().getEnlaceVistaContorlador().getValoresMostradosPorPantalla().bind(contenedorValorCambiante);
//	
		
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
