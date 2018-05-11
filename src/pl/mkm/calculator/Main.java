package pl.mkm.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("ja.jpg")));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
