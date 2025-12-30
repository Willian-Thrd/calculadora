package org.will;

import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController extends App{
    @FXML
    private Label Visor;

    @FXML
    private void um(ActionEvent e) {
        Visor.setText(Visor.getText() + "1");
    }

    @FXML
    private void dois(ActionEvent e) {
        Visor.setText(Visor.getText() + "2");
    }

    @FXML
    private void tres(ActionEvent e) {
        Visor.setText(Visor.getText() + "3");
    }

    @FXML
    private void quatro(ActionEvent e) {
        Visor.setText(Visor.getText() + "4");
    }

    @FXML
    private void cinco(ActionEvent e) {
        Visor.setText(Visor.getText() + "5");
    }

    @FXML
    private void seis(ActionEvent e) {
        Visor.setText(Visor.getText() + "6");
    }
    
    @FXML
    private void sete(ActionEvent e) {
        Visor.setText(Visor.getText() + "7");
    }

    @FXML
    private void oito(ActionEvent e) {
        Visor.setText(Visor.getText() + "8");
    }

    @FXML
    private void nove(ActionEvent e) {
        Visor.setText(Visor.getText() + "9");
    }

    @FXML
    private void zero(ActionEvent e) {
        Visor.setText(Visor.getText() + "0");
    }

    @FXML
    private void mais(ActionEvent e) {
        Visor.setText(Visor.getText() + "+");
    }

    @FXML
    private void menos(ActionEvent e) {
        Visor.setText(Visor.getText() + "-");
    }

    @FXML
    private void vezes(ActionEvent e) {
        Visor.setText(Visor.getText() + "*");
    }

    @FXML
    private void dividir(ActionEvent e) {
        Visor.setText(Visor.getText() + "/");
    }

    @FXML
    private void apagar(ActionEvent e) {
        Visor.setText("");
    }

    @FXML
    private void igual(ActionEvent e) {
    String num = Visor.getText();
    String op = "";

    if (num.contains("+")) op = "+";
    else if (num.contains("-")) op = "-";
    else if (num.contains("*")) op = "*";
    else if (num.contains("/")) op = "/";

    String[] partes = num.split("\\" + op);

    double a = Double.parseDouble(partes[0]);
    double b = Double.parseDouble(partes[1]);

    double result = 0.0;

    switch (op) {
        case "+":
            result = a + b;
        break;

        case "-":
            result = a - b;
        break;

        case "*":
            result = a * b;
        break;

        case "/":
            result = a / b;
        break;
    }

    Visor.setText(String.valueOf(result));
    }
}
