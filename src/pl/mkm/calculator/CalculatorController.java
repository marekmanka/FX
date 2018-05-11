package pl.mkm.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Button n0;
    @FXML
    private Button n1;
    @FXML
    private Button n2;
    @FXML
    private Button n3;
    @FXML
    private Button n4;
    @FXML
    private Button n5;
    @FXML
    private Button n6;
    @FXML
    private Button n7;
    @FXML
    private Button n8;
    @FXML
    private Button n9;
    @FXML
    private Button comma;
    @FXML
    private Button abs;
    @FXML
    private Button add;
    @FXML
    private Button sub;
    @FXML
    private Button mul;
    @FXML
    private Button div;
    @FXML
    private Button eq;
    @FXML
    private TextField display;

    public void initialize() {
        n0.setOnAction(event -> display.setText("0"));
    }
}
