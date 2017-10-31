package wsp_homework2;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;

public class NumberInformationWidget extends GridPane {
    TextField tf;
    ComboBox<String> cb;
    Button b;
    TextArea ta;
    public NumberInformationWidget() {
        tf = new TextField();
        tf.setPromptText("Enter a Number");

        add(tf, 0, 0);
        setHgrow(tf, Priority.ALWAYS);
        cb = new ComboBox<String>();
        cb.getItems().addAll("Even", "Prime");
        cb.getSelectionModel().selectFirst();
        add(cb, 1, 0);
        
        b = new Button("Run");
        add(b, 2, 0);
        
        ta = new TextArea();
        add(ta, 0, 1, 1, 2);
        b.setOnAction( 
            (event) -> {
                if (tf.getText().matches("[0-9]*")) {
                    int value = Integer.parseInt(tf.getText());
                    if (cb.getValue() == "Even") {
                        if(value%2==0) {
                            ta.appendText("Even: " +tf.getText()+" is even.\n");
                        } else {
                            ta.appendText("Even: " +tf.getText()+" is NOT even.\n");
                        }
                    } else if (cb.getValue() == "Prime") {
                        if (value < 1) {
                            ta.appendText("Prime: "+tf.getText()+" is NOT Prime\n");
                        } else if (value <= 3) {
                            ta.appendText("Prime: "+tf.getText()+" is Prime\n");
                        } else {
                            boolean primeToggle = true;
                            for (int i = 2; i <= Math.round(Math.sqrt(value)); i++) {
                                if ((value%i)==0) {
                                    ta.appendText("Prime: "+tf.getText()+" is NOT Prime\n");
                                    primeToggle = false;
                                    break;
                                }
                            }
                            if (primeToggle) {
                                ta.appendText("Prime: "+tf.getText()+" is Prime\n");
                            }
                        }
                    }
                } else { ta.appendText("Please enter a valid number!\n"); }
            }
        );
    }
//    public boolean isInteger(String value) {
//        try {
//            Integer.parseInt(value);
//        } catch (NumberFormatExeception e) {
//            return false;
//        } catch (NullPointException e) {
//            return false;
//        }
//        return true;
//    }
}
