package dad.javafx.calculadora.modelo;

public class Calculadora {
	private char symbol;
	private double total1;
	private double auxTotal;
	private Boolean comprobarSymbolo=false;
	private StringBuilder pantalla = new StringBuilder();
	
	public Calculadora(){
		borradoTotal();
	}
	
	public void insertar(int i) {
		pantalla.append(i);
	}

	public void insertarPunto(){
		if (!pantalla.toString().contains(".") && pantalla.length()>0)
			pantalla.append(".");
	}
	public void borrar() {
		if (pantalla.length()!=0) {
			pantalla.deleteCharAt(pantalla.length()-1);
		}
		
	};
	public void borradoTotal() {
		total1=0;
		auxTotal=0;
		pantalla.setLength(0);
		symbol=' ';
	}
	public void calcular(char _numero) {
		symbol=_numero;
		comprobarSymbolo=pantalla.length()!=0?true:false;
		total1=pantalla.length()==0?auxTotal:Double.parseDouble(pantalla.toString());
		switch (_numero) {
			case'+':
				if (comprobarSymbolo) {
					auxTotal+=total1;
					pantalla.setLength(0);}
				break;
			case'*':
				if (comprobarSymbolo) {
					if (auxTotal==0)
						auxTotal=total1;
					else
						auxTotal=auxTotal*total1;
				
					pantalla.setLength(0);
				}
				break;
			case'-':
				if (comprobarSymbolo) {
					if (auxTotal==0)
						auxTotal=total1;
					else
						auxTotal-=total1;
				
					pantalla.setLength(0);
				}
				
				break;
				
			case'/':
				if (comprobarSymbolo) {
					if (auxTotal==0)
						auxTotal=total1;
					else 
						auxTotal=auxTotal/total1;
					pantalla.setLength(0);
				}
		}
	}
	public void añadirCalculosPantalla() {
		if (comprobarSymbolo) {
			calcular(symbol);
			pantalla.append(auxTotal);
		}
		
	}
	public char getSymbol() {
		return symbol;
	}
	public String getVisualizarPantalla() {
		return pantalla.toString();
	}
	public double getValorTotal() {
		return auxTotal;
	}

		
	}


