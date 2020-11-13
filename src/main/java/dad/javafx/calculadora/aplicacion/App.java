package dad.javafx.calculadora.aplicacion;

import dad.javafx.calculadora.controlador.Controlador;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controlador controlador;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controlador = new Controlador();

		Scene verScene = new Scene(controlador.getView(), 400, 400);

		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(verScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
