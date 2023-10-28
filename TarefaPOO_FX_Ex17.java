import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TarefaPOO_FX_Ex17 extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Agenda de Contatos");

        BorderPane painel = new BorderPane();
        Scene scene = new Scene(painel, 420, 200);

        GridPane centerPane = new GridPane();
        centerPane.setHgap(10);
        centerPane.setVgap(10);
        centerPane.setPadding(new Insets(20, 20, 20, 20));

        Label idLabel = new Label("ID:");
        TextField idTextField = new TextField();
        idTextField.setPrefWidth(320);

        Label nameLabel = new Label("Nome:");
        TextField nameTextField = new TextField();

        Label phoneLabel = new Label("Telefone:");
        TextField phoneTextField = new TextField();

        centerPane.add(idLabel, 0, 0);
        centerPane.add(idTextField, 1, 0);
        centerPane.add(nameLabel, 0, 1);
        centerPane.add(nameTextField, 1, 1);
        centerPane.add(phoneLabel, 0, 2);
        centerPane.add(phoneTextField, 1, 2);

        painel.setCenter(centerPane);

        
        HBox bottomPane = new HBox();
        Button saveButton = new Button("Salvar");
        Button searchButton = new Button("Pesquisar");
        bottomPane.getChildren().addAll(saveButton, searchButton);
        bottomPane.setAlignment(Pos.TOP_LEFT);
        painel.setBottom(bottomPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
