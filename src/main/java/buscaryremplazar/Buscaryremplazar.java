package buscaryremplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Buscaryremplazar extends Application {

	public void start(Stage primaryStage) {
		try {
			
			//Primera seccion
			Text valor1 = new Text("Buscar:");
			Text valor2 = new Text("Reemplazar con:");
			VBox sec1 = new VBox();
			sec1.setSpacing(5);
			
			sec1.getChildren().addAll(valor1,valor2);
			
			
			
			TextField valorabuscar = new TextField();
			valorabuscar.setPrefColumnCount(15);
			TextField valorreemplazar = new TextField();
			valorreemplazar.setPrefColumnCount(15);
			CheckBox Mym = new CheckBox("Mayusculas y minusculas");
			CheckBox buscaratras = new CheckBox("Buscar hacia atras");
			HBox check1= new HBox();
			check1.setSpacing(5);
			check1.getChildren().addAll(Mym,buscaratras);
			CheckBox Exr = new CheckBox("Expresion regular");
			CheckBox Resaltar = new CheckBox("Resaltar resultados");
			HBox check2= new HBox();
			check2.setSpacing(5);
			check2.getChildren().addAll(Exr,Resaltar);
			VBox sec2 = new VBox();
			sec2.setSpacing(5);
			
			sec2.getChildren().addAll(valorabuscar,valorreemplazar,check1,check2);
			
			//Segunda seccion
			Button buscar = new Button("Buscar");
			Button reemplazar = new Button("Reemplazar");
			Button reemplazartodo= new Button("Reemplazar todo");
			Button cerrar = new Button("Cerrar");
			Button ayuda = new Button("Ayuda");
			
			VBox sec3 = new VBox();
			sec3.setSpacing(5);
			sec3.getChildren().addAll(buscar,reemplazar,reemplazartodo,cerrar,ayuda);
		
			
			//Final
			HBox root = new HBox();
			root.setSpacing(10);
			root.setAlignment(Pos.CENTER);
            root.getChildren().addAll(sec1,sec2,sec3);
			
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setTitle("Buscar y remplazar");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
