package pl.mkm.login;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button signIn;
    @FXML
    private Label signInPassed;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //signInPassed.setVisible(false);
        signInPassed.setText("acb");
        signIn.setOnAction( event -> signInPassed.setText("acb"));
        System.out.println("sssssss");
    }
}