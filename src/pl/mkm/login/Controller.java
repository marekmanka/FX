package pl.mkm.login;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Button signIn;
    @FXML
    private Label signInPassed;

    public void initialize(){
        signInPassed.setVisible(false);
        signInPassed.setText("acb");
        signIn.setOnAction( event -> signInPassed.setText("acb"));
    }

}
