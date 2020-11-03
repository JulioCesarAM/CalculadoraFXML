package dad.javafx.calculadora.vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

public class Vista  {

	 
	@FXML
	private VBox calculadora,subContenedor3p1,subContenedor3p1_5,subContenedor3p1_6,subContenedor3p1_4;
	@FXML
	private HBox contenedorTecladoCalculadora1,contenedorTecladoCalculadora2,contenedorTecladoCalculadora3,
	subContenedor3p1_1,subContenedor3p1_2,subContenedor3p1_3;
	@FXML
	private TextField pantallaCalculadora;
	@FXML
	private Button teclaN0,teclaN1,teclaN2,teclaN3,teclaN4,teclaN5,teclaN6,teclaN7,teclaN8,teclaN9,teclaBorradoTotal,
	teclaBorrarSimple,teclaMultiplicar,teclaDividir,teclaSumar,teclaRestar,teclaIgual,teclaPunto;
	

	
	public Vista () throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/vista.fxml"));
		loader.setController(this);
		loader.load();
		pantallaCalculadora.setDisable(true);
	}
	
	
	
	public VBox getCalculadora() { 
		return this.calculadora;
	}
	
	public StringProperty getPantallaCalculadora() {
		return pantallaCalculadora.textProperty();
	}
	public Button getTeclaN0() {
		return teclaN0;
	}

	public Button getTeclaN1() {
		return teclaN1;
	}


	public Button getTeclaN2() {
		return teclaN2;
	}


	public Button getTeclaN3() {
		return teclaN3;
	}


	public Button getTeclaN4() {
		return teclaN4;
	}


	public Button getTeclaN5() {
		return teclaN5;
	}


	public Button getTeclaN6() {
		return teclaN6;
	}


	public Button getTeclaN7() {
		return teclaN7;
	}


	public Button getTeclaN8() {
		return teclaN8;
	}


	public Button getTeclaN9() {
		return teclaN9;
	}


	public Button getTeclaBorradoTotal() {
		return teclaBorradoTotal;
	}


	public Button getTeclaBorrarSimple() {
		return teclaBorrarSimple;
	}


	public Button getTeclaMultiplicar() {
		return teclaMultiplicar;
	}


	public Button getTeclaDividir() {
		return teclaDividir;
	}


	public Button getTeclaSumar() {
		return teclaSumar;
	}


	public Button getTeclaRestar() {
		return teclaRestar;
	}


	public Button getTeclaIgual() {
		return teclaIgual;
	}


	public Button getTeclaPunto() {
		return teclaPunto;
	}




	
	

}
