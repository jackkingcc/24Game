package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        Pane pane = preparePanel();
        ObservableList list = root.getChildren();
        //list.add(pane);
        primaryStage.show();
    }

    private Pane preparePanel() {
        VBox pane = new VBox();
        pane.setSpacing(10);
        ObservableList list= pane.getChildren();
        Text text = new Text("Hello");
        Button button = new Button("Start");
        list.add(text);
        list.add(button);
        return pane;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
