package pl.mkm.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LoginController {
    @FXML
    private Button signIn;
    @FXML
    private Label signInPressed;

    public void initialize() {
        signInPressed.setVisible(false);
        signIn.setOnAction(event -> signInPressed.setVisible(true));
    }
}
