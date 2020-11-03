package dad.javafx.calculadora.controlador;

import java.io.IOException;

import dad.javafx.calculadora.modelo.CalculadoraO;
import dad.javafx.calculadora.vista.Vista;

public class ModificarVista {
	CalculadoraO calc;
	private Vista calculadora;
	
	public ModificarVista() throws IOException {
		calc= new CalculadoraO();
		calculadora= new Vista();
		cargarCalculadora();
			
		
		
		}
	
	
	private void cargarCalculadora() {
		calculadora.getTeclaN0().setOnAction(e-> logicaBotones(0));
		calculadora.getTeclaN1().setOnAction(e-> logicaBotones(1));
		calculadora.getTeclaN2().setOnAction(e-> logicaBotones(2));
		calculadora.getTeclaN3().setOnAction(e-> logicaBotones(3));
		calculadora.getTeclaN4().setOnAction(e-> logicaBotones(4));
		calculadora.getTeclaN5().setOnAction(e-> logicaBotones(5));
		calculadora.getTeclaN6().setOnAction(e-> logicaBotones(6));
		calculadora.getTeclaN7().setOnAction(e-> logicaBotones(7));
		calculadora.getTeclaN8().setOnAction(e-> logicaBotones(8));
		calculadora.getTeclaN9().setOnAction(e-> logicaBotones(9));
		calculadora.getTeclaBorradoTotal().setOnAction(e->logicaBotonesBorradoTotal());
		calculadora.getTeclaBorrarSimple().setOnAction(e-> logicaBotonesBorradoSimple());
		calculadora.getTeclaPunto().setOnAction(e-> calc.insertarPunto());
		calculadora.getTeclaSumar().setOnAction(e->logicaBotonesOperaciones('+'));
		calculadora.getTeclaRestar().setOnAction(e->logicaBotonesOperaciones( '-'));
		calculadora.getTeclaMultiplicar().setOnAction(e->logicaBotonesOperaciones('*'));
		calculadora.getTeclaDividir().setOnAction(e->logicaBotonesOperaciones('/'));
		calculadora.getTeclaIgual().setOnAction(e->logicaBotonesIgual());
		
		
		}


	private void logicaBotones(int i) {
		calc.insertar(i);
		calculadora.getPantallaCalculadora().set(calc.getVisualizarPantalla());
//		System.out.println(calc.getPantalla().toString() );
	}
	private void logicaBotonesBorradoSimple() {
		calc.borrar();
		calculadora.getPantallaCalculadora().set(calc.getVisualizarPantalla());
		
	}
	private void logicaBotonesBorradoTotal() {
		calculadora.getPantallaCalculadora().set("");
		calc.borradoTotal();
		
	}
	private void logicaBotonesOperaciones(char symbolo) {
		switch (symbolo) {
			case'+':
				calculadora.getPantallaCalculadora().set("");
				calc.calcular(symbolo);
				break;
			case'-':
				calculadora.getPantallaCalculadora().set("");
				calc.calcular(symbolo);
				break;
			case'/':
				calculadora.getPantallaCalculadora().set("");
				calc.calcular(symbolo);
				break;
			case'*':
				calculadora.getPantallaCalculadora().set("");
				calc.calcular(symbolo);
				break;
		}
	}
	private void logicaBotonesIgual() {
		calc.añadirCalculosPantalla();
		calculadora.getPantallaCalculadora().set(calc.getVisualizarPantalla());
	}
	public String getValorPantalla() {
		return calc.getVisualizarPantalla();
	}

	public Vista getCalculadora() {
		return calculadora;
	}
	
	
	

}

