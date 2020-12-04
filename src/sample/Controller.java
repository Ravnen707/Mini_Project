package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField Nr1Field;

    @FXML
    private TextField Nr2Field;

    @FXML
    private TextField ResultField;


    private int Nr1;
    private int Nr2;
    private int result;

    @FXML
    void addClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        result = calculate(Nr1, Nr2, '+');
        ResultField.setText(Integer.toString(result));
    }

    @FXML
    void subClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        result = calculate(Nr1, Nr2, '-');
        ResultField.setText(Integer.toString(result));
    }
    @FXML
    void multiClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        result = calculate(Nr1, Nr2, '*');
        ResultField.setText(Integer.toString(result));
}
    @FXML
    void divideClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        result = calculate(Nr1, Nr2, '/');
        ResultField.setText(Integer.toString(result));
    }
        public int calculate(int Nr1, int Nr2, char operator) {
            switch (operator) {
                case '+':
                    return Nr1 + Nr2;
                case '-':
                    return Nr1 - Nr2;
                case '*':
                    return Nr1 * Nr2;
                case '/':
                    return Nr1 / Nr2;
            }
            return 0;
        }

    }
