package dad.buscaryremplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buscaryreemplazar extends Application {

	// view

	private TextField buscarText;
	private TextField reemplazarText;
	private RadioButton Mayusculas;
	private RadioButton Buscarhaciaatras;
	private RadioButton ExpresionRegular;
	private RadioButton Resaltar;
	private Button buscar, reemplazar, reemplazartodo, cerrar, ayuda;

	@Override
	public void start(Stage primaryStage) throws Exception {

		buscarText = new TextField();
		buscarText.setPromptText("Buscar");
		reemplazarText = new TextField();
		reemplazarText.setPromptText("Reemplazar");

		Mayusculas = new RadioButton("Mayusculas y minusculas");
		Buscarhaciaatras = new RadioButton("Buscar hacia atras");
		ExpresionRegular = new RadioButton("Expresion regular");
		Resaltar = new RadioButton("Resaltar resultados");
		buscar = new Button("Buscar");
		buscar.setDefaultButton(true);
		buscar.setPrefSize(110, 20);
		reemplazar = new Button("Reemplazar");
		reemplazar.setPrefSize(110, 20);
		reemplazartodo = new Button("Reemplazar todo");
		reemplazartodo.setPrefSize(110, 20);
		cerrar = new Button("Cerrar");
		cerrar.setPrefSize(110, 20);
		ayuda = new Button("Ayuda");
		ayuda.setPrefSize(110, 20);

		HBox h1 = new HBox();
		h1.setSpacing(10);
		h1.setAlignment(Pos.CENTER);
		h1.getChildren().addAll(Mayusculas, Buscarhaciaatras);
		HBox h2 = new HBox();
		h2.setSpacing(47);
		h2.setAlignment(Pos.CENTER);
		h2.getChildren().addAll(ExpresionRegular, Resaltar);
		VBox RadioBox = new VBox();
		RadioBox.setSpacing(10);
		RadioBox.setAlignment(Pos.CENTER);
		RadioBox.getChildren().addAll(h1, h2);

		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		root.addRow(0, new Label("Buscar: "), buscarText);
		root.addRow(1, new Label("Reemplazar con: "), reemplazarText);
		root.add(RadioBox, 1, 2);
		root.add(buscar, 3, 0);
		root.add(reemplazar, 3, 1);
		root.add(reemplazartodo, 3, 2);
		root.add(cerrar, 3, 3);
		root.add(ayuda, 3, 4);
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };
		root.getColumnConstraints().setAll(cols);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);

		GridPane.setRowSpan(RadioBox, 2);
		root.setStyle("-fx-background-color: blue;");

		Scene scene = new Scene(root, 540, 280);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
