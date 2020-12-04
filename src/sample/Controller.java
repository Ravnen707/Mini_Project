package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
    private char operator;

    @FXML
    void addClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        operator = '+';
        result = calculate(Nr1, Nr2);
        ResultField.setText(Integer.toString(result));
        save();
    }

    @FXML
    void subClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        operator = '-';
        result = calculate(Nr1, Nr2);
        ResultField.setText(Integer.toString(result));
        save();
    }

    @FXML
    void multiClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        operator = '*';
        result = calculate(Nr1, Nr2);
        ResultField.setText(Integer.toString(result));
        save();
    }

    @FXML
    void divideClick() {
        Nr1 = Integer.parseInt(Nr1Field.getText());
        Nr2 = Integer.parseInt(Nr2Field.getText());
        operator = '/';
        result = calculate(Nr1, Nr2);
        ResultField.setText(Integer.toString(result));
        save();
    }

    public int calculate(int Nr1, int Nr2) {
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
    public void save() {
        File f = new File("result.txt");
        try {
           if (f.createNewFile()) {
            }
        } catch (IOException ioException) {
            System.out.println("Error");
            ioException.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("result.txt");
            fw.write(Nr1 + " " + operator + " " + Nr2 +  " = " + result);
            System.out.println(Nr1);
            System.out.println(Nr2);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

