package pl.mkm.calculator;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Formatter;

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
    private Button clr;
    @FXML
    private TextField display;
    @FXML
    private TextField sn;

    private Double number = 0.00;
    private Double result = 0.00;
    private String stringNumber = "0,00";
    private Formatter formatter = new Formatter();
    private int function = 0; // 0 _  1 +   2 -   3 *   4 /

    public void initialize() {


        clr.setOnAction(event -> setClr());

        n1.setOnAction(event -> setN("1"));
        n2.setOnAction(event -> setN("2"));
        n3.setOnAction(event -> setN("3"));
        n4.setOnAction(event -> setN("4"));
        n5.setOnAction(event -> setN("5"));
        n6.setOnAction(event -> setN("6"));
        n7.setOnAction(event -> setN("7"));
        n8.setOnAction(event -> setN("8"));
        n9.setOnAction(event -> setN("9"));
        n0.setOnAction(event -> setN("0"));
        abs.setOnAction(event -> setAbs());

        comma.setOnAction(event -> setN("."));

        add.setOnAction(event -> setAdd());


    }

    private void setClr() {
        stringNumber = "";
        number = 0.00;
        result = 0.00;
        function = 0;
        display.setText("0,00");
        sn.setText("");
        display.setAlignment(Pos.CENTER_RIGHT);
        sn.setAlignment(Pos.CENTER);
    }

    private void setN(String n) {
        if (n.equals(".") && stringNumber.contains(".")) {
            stringNumber = stringNumber;
        } else {
            stringNumber = stringNumber + n;
        }
        display.setText(stringNumber);
        number = Double.parseDouble(stringNumber);

        if (stringNumber.length() < 10) {
            display.setText(String.format("%.2f", number));
            display.setAlignment(Pos.CENTER_RIGHT);
        } else {
            display.setText(String.format("%6.9e", number));
            display.setAlignment(Pos.CENTER_RIGHT);
        }
    }

    private void setAbs() {
        if (Double.parseDouble(getText1(display.getText())) != 0) {
            if (sn.getText().equals("-")) {
                sn.setText("");
                sn.setAlignment(Pos.CENTER);
            } else {
                sn.setText("-");
                sn.setAlignment(Pos.CENTER);
            }
        }

    }

    private String getText1(String string) {
        string = string.replace(',', '.');
        return string;
    }

    private void setAdd() {
        stringNumber = display.getText();
        if (stringNumber.equals("")) {
            stringNumber = "0,00";
        }
        stringNumber = stringNumber.replace(',', '.');
        result = Double.parseDouble(stringNumber);

        if (function == 0) {

        }


        display.setText("0,00");
        display.setAlignment(Pos.CENTER_RIGHT);
    }

}
