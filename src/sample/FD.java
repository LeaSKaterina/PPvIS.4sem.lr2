package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.view.View;

public class FD extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("FD");
        primaryStage.setScene(new Scene(new View(primaryStage)));
        primaryStage.sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
