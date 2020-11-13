package dad.javafx.calculadora.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.calculadora.modelo.Calculadora;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controlador implements Initializable {

	// modelo

	private Calculadora calc = new Calculadora();

	// vista

	@FXML
	private VBox view;

	@FXML
	private TextField pantallaCalculadora;

	@FXML
	private Button teclaN0, teclaN1, teclaN2, teclaN3, teclaN4, teclaN5, teclaN6, teclaN7, teclaN8, teclaN9,
			teclaBorradoTotal, teclaBorrarSimple, teclaMultiplicar, teclaDividir, teclaSumar, teclaRestar, teclaIgual,
			teclaPunto;

	public Controlador() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/vista.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		teclaN0.setOnAction(e -> logicaBotones(0));
		teclaN1.setOnAction(e -> logicaBotones(1));
		teclaN2.setOnAction(e -> logicaBotones(2));
		teclaN3.setOnAction(e -> logicaBotones(3));
		teclaN4.setOnAction(e -> logicaBotones(4));
		teclaN5.setOnAction(e -> logicaBotones(5));
		teclaN6.setOnAction(e -> logicaBotones(6));
		teclaN7.setOnAction(e -> logicaBotones(7));
		teclaN8.setOnAction(e -> logicaBotones(8));
		teclaN9.setOnAction(e -> logicaBotones(9));
		teclaBorradoTotal.setOnAction(e -> logicaBotonesBorradoTotal());
		teclaBorrarSimple.setOnAction(e -> logicaBotonesBorradoSimple());
		teclaPunto.setOnAction(e -> calc.insertarPunto());
		teclaSumar.setOnAction(e -> logicaBotonesOperaciones('+'));
		teclaRestar.setOnAction(e -> logicaBotonesOperaciones('-'));
		teclaMultiplicar.setOnAction(e -> logicaBotonesOperaciones('*'));
		teclaDividir.setOnAction(e -> logicaBotonesOperaciones('/'));
		teclaIgual.setOnAction(e -> logicaBotonesIgual());
	}

	private void logicaBotones(int i) {
		calc.insertar(i);
		pantallaCalculadora.setText(calc.getVisualizarPantalla());
	}

	private void logicaBotonesBorradoSimple() {
		calc.borrar();
		pantallaCalculadora.setText(calc.getVisualizarPantalla());

	}

	private void logicaBotonesBorradoTotal() {
		pantallaCalculadora.setText("");
		calc.borradoTotal();

	}

	private void logicaBotonesOperaciones(char symbolo) {
		pantallaCalculadora.setText("");
		calc.calcular(symbolo);
	}

	private void logicaBotonesIgual() {
		calc.añadirCalculosPantalla();
		pantallaCalculadora.setText(calc.getVisualizarPantalla());
	}

	public VBox getView() {
		return view;
	}

}